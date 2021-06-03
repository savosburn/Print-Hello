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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // Concatenation
        String outputString = "Hello, " + name + ", nice to meet you!";

        // Output
        System.out.println(outputString);
    }
}
