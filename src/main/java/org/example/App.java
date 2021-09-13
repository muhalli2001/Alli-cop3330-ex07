package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner length = new Scanner(System.in);
        System.out.println("What is the length of your room in feet?");
        String Length = length.nextLine();
        int LENGTH = Integer.parseInt(Length);

        Scanner width = new Scanner(System.in);
        System.out.println("What is the width of your room in feet?");
        String Width = width.nextLine();
        int WIDTH = Integer.parseInt(Width);

        int area = LENGTH * WIDTH;

        System.out.println("The area in square feet: "+area);

        double converter = 0.09290304;

        double result = converter * area;

        System.out.printf("Area in square meters: %.6f", result);


    }

}
