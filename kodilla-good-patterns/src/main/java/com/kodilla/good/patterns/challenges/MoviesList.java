package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MoviesList {
    public static void main(String[] args) {
        new MoviesList().ListUpMovies(new MovieStore());
    }

    public void ListUpMovies(MovieStore movieStore) {
        if (movieStore == null) {
            throw new IllegalArgumentException("List is empty");
        }
        String showMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(showMovies);
    }
}
