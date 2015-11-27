package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;
import views.html.*;

import java.util.*;

public class Application extends Controller {
    public static int postCount;
    public static FileControl fc;
    public static LinkedList<RealPost> posts;

    public Result index() {
        return ok(main.render("Distributed System Forum"));
    }

    public Result postPage() {
        return ok(postPage.render(form(Post.class)));
    }
    
    public Result commentPage() {
        //return ok(commentPage.render(form(Comment.class)));
        
        Form<Comment> cmtForm = new Form<Comment>(Comment.class);
        Comment cmt = new Comment();
        
        cmt.user = "God";
        cmt.content = "NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
        cmt.postTitle = "Hello FUCKERS";
        
        cmtForm = cmtForm.fill(cmt);
        
        return ok(commentPage.render(cmtForm));
    }
    
    public Result newCommentClick(Integer post) {
        System.out.println("This post's id is " + post);
        //for (p : posts) {
            
        //}
        
        
        return ok();
    }
    
    public Result createPost() {
        Form<Post> formPost = form(Post.class).bindFromRequest();
        
        if (formPost.hasErrors()) {
            return badRequest(postPage.render(formPost));
        } else {
            int postId = posts.size();
            Post posted = formPost.get();
            
            RealPost result = new RealPost(posted.user, posted.title, posted.content, postId, 0);

            if (fc.writePost(result))
                posts.add(result);
            
            //session().clear();
            //session("user", posted.user);
            //session("title", posted.title);
            //session("content", posted.content);
            
            System.out.println("Post @" + posted.user + " #" + posted.title + " =" + posted.content);
            
            return redirect(
                routes.Application.postPage()
            );
        }
    }
    
    public Result createComment() {
        Form<Comment> formComment = form(Comment.class).bindFromRequest();
        
        if (formComment.hasErrors()) {
            return badRequest(commentPage.render(formComment));
        } else {
            Comment cmt = formComment.get();
            
            //session().clear();
            //session("user", cmt.user);
            //session("content", cmt.content);
            
            System.out.println("Comment @" + cmt.user + " =" + cmt.content);
            
            return redirect(
                routes.Application.commentPage()
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
        public RealPost mainPost;
    }
}