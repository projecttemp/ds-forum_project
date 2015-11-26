import play.*;
import play.libs.*;

import java.util.*;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app) {
        controllers.Application.postCount = 0;
        controllers.Application.fc = new controllers.FileControl("Posts");
        controllers.Application.posts = controllers.Application.fc.readPostList();
    }
}