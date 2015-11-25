import play.*;
import play.libs.*;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app) {
        controllers.Application.postCount = 0;
        controllers.Application.fc = new controllers.FileControl("Posts");
    }
}