package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Main Branch.");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of co-ordinates x1 and y1 for a line:");
        int x1= in.nextInt();
        int y1= in.nextInt();
        System.out.println("Enter the values of co-ordinates x2 and y2 for a line:");
        int x2= in.nextInt();
        int y2= in.nextInt();
        double length= Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("The length of the given line is: "+length);
    }
}
