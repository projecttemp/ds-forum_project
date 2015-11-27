import play.*;
import play.libs.*;

import java.util.*;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app) {
        controllers.Application.postCount = 0;
        controllers.Application.fc = new controllers.FileControl("Posts");
        controllers.Application.posts = controllers.Application.fc.readPostList();
        controllers.Application.comments = new LinkedList<LinkedList<controllers.RealComment>>();
        
        for (controllers.RealPost p: controllers.Application.posts) {
            LinkedList<controllers.RealComment> c = controllers.Application.fc.readCommentList(p.id);
            if (c.size() == 0) {
                controllers.Application.comments.add(p.id, new LinkedList<controllers.RealComment>());
            } else {
                controllers.Application.comments.add(p.id, c);    
            }
            
        }
    }
}