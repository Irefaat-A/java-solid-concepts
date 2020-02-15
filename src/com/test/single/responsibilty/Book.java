package com.test.single.responsibilty;

public class Book {
    private String title;
    private String author;
    private String text;

    public Book(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    //    This method demonstrate Single Responsibility.
    public String replaceAllWordsInText(String word) {
        return text.replaceAll(word, this.text);
    }

    //    This method demonstrate Single Responsibility.
    public boolean findWordInText(String word) {
        return this.text.contains(word);
    }

    //    This method violates single responsibility because it does NOT directly relate to any of the properties of the class.
    public void printTextToConsole(String someText) {
        System.out.println(someText);
    }
}
