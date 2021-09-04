/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution01 {

    /*
    Create a program that:
    Prompts user to;
        input = name
    response;
        print = greeting + Inputname
     */
    private static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("What is your name? "); //*Prompt
        String InputName = in.nextLine(); //*Input
        System.out.println("Hello, " + InputName + ",nice to meet you!"); //*Response
    }
}


