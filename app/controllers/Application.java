package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;
import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result postPage() {
        return ok(postPage.render(form(Post.class)));
    }
    
    public Result createPost() {
        Form<Post> formPost = form(Post.class).bindFromRequest();
        
        if (formPost.hasErrors()) {
            return badRequest(postPage.render(formPost));
        } else {
            Post posted = formPost.get();
            
            session().clear();
            session("user", posted.user);
            session("title", posted.title);
            session("content", posted.content);
            
            System.out.println("Post @" + posted.user + " #" + posted.title + " =" + posted.content);
            
            return redirect(
                routes.Application.postPage()
            );
        }
    }
    
    public static class Post {
        public String user;
        public String title;
        public String content;
    }
}