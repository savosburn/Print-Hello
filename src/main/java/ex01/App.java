package ex01;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String name = myApp.readName();
        String outputString = myApp.generateOutputString(name);
        myApp.printOutput(outputString);
    }

    public String readName() {
        System.out.print("What is your name? ");
        return in.nextLine();
    }

    public String generateOutputString(String name) {
        return String.format("Hello, %s, nice to meet you!", name);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }
}
