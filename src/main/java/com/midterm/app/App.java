package com.midterm.app;

import com.midterm.model.Person;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person person = new Person("John", "Smith");
        System.out.println(person);
    }
}
