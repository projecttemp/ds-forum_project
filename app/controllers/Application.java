package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import play.data.validation.*;
import static play.data.Form.*;

import models.*;
import views.html.*;

import java.util.*;

public class Application extends Controller {
    public static int postCount;
    public static FileControl fc;
    public static LinkedList<RealPost> posts;
    public static LinkedList<LinkedList<RealComment>> comments;
    
    public Result index() {
        //return ok(index.render("Distributed System Forum"));
        
        return redirect(
            routes.Application.mainPage()
        );
    }
    
    public Result mainPage() {
        return ok(main.render("Distributed System Forum"));
    }

    public Result postPage() {
        return ok(postPage.render(form(Post.class)));
    }
    
    public Result commentPage(Integer id) {
        //System.out.println("#2 This post's id is " + id);
        
        Form<Comment> cmtForm = new Form<Comment>(Comment.class);
        Comment cmt = new Comment();
        cmt.mainPostID = id;
        
        if (id >= 0) {
            
            RealPost rp = null;
            
            for (RealPost p : posts) {
                if (p.id == id) {
                    rp = p;
                    break;
                }
            }
            
            if (rp != null)
                cmt.postTitle = rp.title;
        }
        
        cmtForm = cmtForm.fill(cmt);
        return ok(commentPage.render(cmtForm));
    }
    
    public Result newCommentClick(Integer postID) {
        //System.out.println("#1 This post's id is " + postID);
        
        return redirect(
            routes.Application.commentPage(postID)
        );
    }
    
    public Result createPost() {
        Form<Post> formPost = form(Post.class).bindFromRequest();
        
        if (formPost.hasErrors()) {
            return badRequest(postPage.render(formPost));
        } else {
            int postId = posts.size();
            Post posted = formPost.get();
            
            RealPost result = new RealPost(posted.user, posted.title, posted.content, postId, 0);

            if (fc.writePost(result)) {
                posts.add(result);
                comments.add(result.id, new LinkedList<RealComment>());
            }
            
            System.out.println("Post @" + posted.user + " #" + posted.title + " =" + posted.content);
            
            return redirect(
                routes.Application.mainPage()
            );
        }
    }
    
    public Result createComment() {
        Form<Comment> formComment = form(Comment.class).bindFromRequest();

        if (formComment.hasErrors()) {
            Comment cmt = new Comment();
            cmt.postTitle = "***Please go back to main page and try again!***";
            formComment = formComment.fill(cmt);
            
            return badRequest(commentPage.render(formComment));
        } else {
            Comment cmt = formComment.get();
            
            RealComment result = null;
            RealPost rp = null;
            
            for (RealPost p : posts) {
                if (p.id == cmt.mainPostID) {
                    rp = p;
                    break;
                }
            }
            
            if (rp != null) {
                result = new RealComment(cmt.user, cmt.content, rp.commentCount, cmt.mainPostID);
                rp.commentCount++;
            }
            
            if (result != null) {
                if (fc.writeComment(result)) {
                    fc.writePost(rp);
                    comments.get(rp.id).add(result);
                }
            }
            
            System.out.println("Comment @" + cmt.user + " =" + cmt.content + "#" + cmt.mainPostID);
            
            return redirect(
                routes.Application.mainPage()
            );
        }
    }
    
    public static class Post {
        public String user;
        public String title;
        public String content;
    }
    
    public static class Comment {
        public String user;
        public String content;
        public String postTitle;
        public int mainPostID;
        
        public String validate() {
            if (mainPostID < 0)
                return "Please return to main page and try again!";
                
            return null;
        }
    }
}