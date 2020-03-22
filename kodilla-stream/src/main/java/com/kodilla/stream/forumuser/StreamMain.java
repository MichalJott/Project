package com.kodilla.stream.forumuser;

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

                add(new ForumUser(10, "Michal", 'K',
                        LocalDate.of(2001, 1, 13), 0));
                add(new ForumUser(30, "Sara", 'M',
                        LocalDate.of(1993, 1, 13), 0));
                add(new ForumUser(20, "Fiona", 'M',
                        LocalDate.of(1993, 1, 13), 300));
            }
        };


        Stream<ForumUser> userStream = list.stream()

                .filter(user -> (user.getSex() == 'M') && (user.getBirthDay().isBefore(LocalDate.now().minusYears(20))) && (user.getPublishedPost() > 0));

        userStream.forEach(System.out::println);


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
