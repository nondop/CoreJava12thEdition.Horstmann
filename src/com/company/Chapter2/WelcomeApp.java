package com.company.Chapter2;

public class WelcomeApp {

    public static void main(String[] args) {
        String str = "Welcome to Core Java";
        System.out.println(str);
        for (int i = 0; i<str.length(); i++){
            System.out.print("=");
        }
    }
}
