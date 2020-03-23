package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public static String beautify(String name, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(name);
        System.out.println(poemDecorator.decorate(name));
        return result;
    }
}
