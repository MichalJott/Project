package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        PoemBeautifier.beautify("Jonas", name -> name.toLowerCase());
        PoemBeautifier.beautify("Jonas", name -> name.toUpperCase());
        PoemBeautifier.beautify("Jonas", name -> name.replace('J', 'Z' ));
        PoemBeautifier.beautify("Jonas", name -> name.substring(3));


    }

}
