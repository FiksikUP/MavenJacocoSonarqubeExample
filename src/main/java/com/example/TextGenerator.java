package com.example;

public class TextGenerator {

    public static String getText(){
        return getGeneratedText();
    }

    private static String getGeneratedText(){
        return (int) (Math.random() *10) + ". Hello World!!!";
    }

}
