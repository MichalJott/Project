package com.kodilla.stream.forumuser;

import forumuser.ForumUser;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<ForumUser> list = new LinkedList<ForumUser>() {
            {
                add(new ForumUser());
                add(new ForumUser());
                add(new ForumUser(10, "Michal", 'M',
                        LocalDate.of(2001, 1, 13), 0));
                add(new ForumUser(30, "Sara", 'K',
                        LocalDate.of(1993, 1, 13), 200));
                add(new ForumUser(20, "Fiona", 'K',
                        LocalDate.of(1993, 1, 13), 300));
            }
        };


        Stream<ForumUser> userStream = list.stream();
        List<ForumUser> manList = userStream.filter(user -> user.getSex() == 'M').collect(Collectors.toList());
        manList.stream().forEach(
                user -> System.out.println("User: " + user.getUsername() + ", sex: " + user.getSex())
        );


        Stream<ForumUser> birthUserStream = list.stream();
        LocalDate last20 = LocalDate.now().minusYears(20);
        List<ForumUser> moreThan20 = birthUserStream.filter(user -> {
            return user.getBirthDay().isBefore(last20);
        }).collect(Collectors.toList());
        moreThan20.stream().forEach(
                user -> System.out.println("User: " + user.getUsername() + ", birth: " + user.getBirthDay())
        );


        Stream<ForumUser> potsUserStream = list.stream();
        List<ForumUser> anyPost = potsUserStream.filter(user -> {
            return user.getBirthDay().isBefore(last20);
        }).collect(Collectors.toList());
        anyPost.stream().forEach(
                user -> System.out.println("User: " + user.getUsername() + ", post: " + user.getPublishedPost())
        );


        Map<Integer, String> userMap = new HashMap<>();
        try {

            userMap = list.stream().collect(Collectors.toMap(ForumUser::getId, ForumUser::getUsername));
        } catch (IllegalStateException ise) {
            System.out.println("Exception cached info: " + ise.getMessage());
        }

        for (Map.Entry<Integer, String> iterator : userMap.entrySet()) {
            System.out.println("key: " + iterator.getKey() + " value: " + iterator.getValue());
        }

    }
}
