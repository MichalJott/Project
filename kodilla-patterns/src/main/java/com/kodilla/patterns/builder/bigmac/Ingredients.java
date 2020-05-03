package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Ingredients {
    private  static final List<String> INGREDIENTS = Arrays.asList("LETTUCE","ONION","BACON","CUCUMBER","CHILI","MUSHROOMS", "SHRIMPS","CHEESE");

    public static boolean checkIngredient(String ingredient){
        if (INGREDIENTS.contains(ingredient)) {
            return true;
        } else  {
            throw new IllegalStateException("We don't have this ingredient ! ");
        }
    }
}