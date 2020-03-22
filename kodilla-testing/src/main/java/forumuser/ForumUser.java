package forumuser;

import java.time.LocalDate;


public class ForumUser {
    private int id;
    private String username;
    private char sex;
    private LocalDate birthDay;
    private int publishedPost;

    public ForumUser() {
        this.id = (int) (Math.random() * 1000);
        this.username = "UserName";
        this.sex = 'M';
        this.birthDay = LocalDate.now();
        this.publishedPost = (int) (Math.random() * 10000);
    }

    public ForumUser(int id, String username, char sex, LocalDate birthDay, int publishedPost) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthDay = birthDay;
        this.publishedPost = publishedPost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getPublishedPost() {
        return publishedPost;
    }

    public void setPublishedPost(int publishedPost) {
        this.publishedPost = publishedPost;
    }
}
