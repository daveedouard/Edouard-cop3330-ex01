/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex01;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.print("What is your name? ");

        String UserName = name.nextLine();

        System.out.print("Hello "+ UserName);
        System.out.print(", nice to meet you!");
    }
}
