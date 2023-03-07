package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public double LineInput(int LineNo){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of co-ordinates x1 and y1 for line "+LineNo+": ");
        int x1= in.nextInt();
        int y1= in.nextInt();
        System.out.println("Enter the values of co-ordinates x2 and y2 for line "+LineNo+": ");
        int x2= in.nextInt();
        int y2= in.nextInt();
        double length= Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("The length of Line "+LineNo+" is: "+length);
        System.out.println("_____________________________________________________________");
        return length;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Main Branch.");

        LineComparison line= new LineComparison();
        double length1= line.LineInput(1);
        double length2= line.LineInput(2);
        System.out.println("********************************************************************");
        if(length1 == length2)
            System.out.println("Lengths of Line 1 and Line 2 are EQUAL.");
        else if(length1 > length2)
            System.out.println("Length of Line 1 is GREATER THAN Length of Line 2.");
        else
            System.out.println("Length of Line 1 is LESSER THAN Length of Line 2.");
    }
}
