package ex01;

import java.util.Scanner;

/*
Exercise 1 - Saying Hello

Create a program that prompts for your name and prints a greeting using your name.

Example Output

What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.
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
