package com.bridgelabz;

import java.util.Scanner;

public class CalculatingLengthCartesian {
    Scanner sc= new Scanner(System.in);
    double x1,y1,x2,y2,x,y;
    public void length(){
        System.out.println("Enter x1: ");
        x1=sc.nextDouble();
        System.out.println("Enter y1: ");
        y1=sc.nextDouble();
        System.out.println("Enter x2: ");
        x2=sc.nextDouble();
        System.out.println("Enter x2: ");
        x2=sc.nextDouble();
        x=Math.pow((x2-x1),2);
        y=Math.pow((y2-y1),2);
        double length=Math.sqrt(x+y);
        System.out.println("Length of Line: "+length);
    }

    public static void main(String[] args) {
        CalculatingLengthCartesian ob=new CalculatingLengthCartesian();
        ob.length();
    }
}
