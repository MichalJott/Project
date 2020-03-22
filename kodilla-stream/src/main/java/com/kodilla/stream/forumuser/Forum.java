package forumuser;

import com.kodilla.stream.forumuser.ForumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> users;

    public Forum() {
        this.users = new ArrayList<>();
    }

    public Forum(List<ForumUser> users) {
        this.users = users;
    }

    public List<ForumUser> getUserList() {
        return this.users;
    }


}
