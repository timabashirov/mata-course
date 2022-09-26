package org.example.oop;

import java.util.Locale;
import  java.util.Scanner;


public class JavaPogram {
    public static void main(String[] args) {
        String source = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task world:");

        source = scanner.next();

        System.out.println(source);


        String sourceUpper = source.toUpperCase();


        String sourceLower = sourceUpper.toLowerCase();

        System.out.println(sourceUpper + sourceLower);







    }
}
