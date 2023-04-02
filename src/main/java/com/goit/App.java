package com.goit;

import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("Igor", "Petrenko");
        System.out.println(new GsonBuilder().create().toJson(person));
    }
}
