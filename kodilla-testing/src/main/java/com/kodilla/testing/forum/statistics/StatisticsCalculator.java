package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculator {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averageUserPosts;
    private double averageUserComments;
    private double averageCommentsPosts;

    public StatisticsCalculator() {
        this.usersNumber = 0;
        this.postsNumber = 0;
        this.commentsNumber = 0;
        this.averageCommentsPosts = 0;
        this.averageUserComments = 0;
        this.averageUserPosts = 0;

    }

    public double getAverageCommentsPosts() {
        return averageCommentsPosts;
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAverageUserPosts() {
        return averageUserPosts;
    }

    public double getAverageUserComments() {
        return averageUserComments;
    }

    public boolean calculateAdvStatistics(Statistics statistics) {

        List<String> listOfUsers = statistics.usersNames();
        this.usersNumber = listOfUsers.size();
        this.postsNumber = statistics.postsCount();
        this.commentsNumber = statistics.commentsCount();

        if (this.usersNumber == 0) {
            System.out.println("Can't divide by 0");
            return false;
        }


        this.averageUserPosts = this.postsNumber / (double) this.usersNumber;
        this.averageUserComments = this.commentsNumber / (double) this.usersNumber;
        if (this.postsNumber == 0) {
            System.out.println("Can't divide by 0");
            return false;
        }
        this.averageCommentsPosts = this.commentsNumber / (double) this.postsNumber;

        return true;
    }

    public void showStatistics() {
        System.out.println("Statistics: /n" + this.toString());

    }

    @Override
    public String toString() {
        return "usersNumber: " + this.usersNumber + "\n"
                + "postsNumber: " + this.postsNumber + "\n"
                + "commentsNumber: " + this.commentsNumber + "\n"
                + "averageUserPosts: " + this.averageUserPosts + "\n"
                + "averageUserComments: " + this.averageUserComments + "\n"
                + "averageCommentsPosts: " + this.averageCommentsPosts + "\n";
    }


}

