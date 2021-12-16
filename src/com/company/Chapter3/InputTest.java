package com.company.Chapter3;

import java.io.Console;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age+1));
    }
}
