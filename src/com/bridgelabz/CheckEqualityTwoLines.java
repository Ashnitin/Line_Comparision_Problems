package com.bridgelabz;

import java.util.Scanner;

public class CheckEqualityTwoLines {
    Scanner sc= new Scanner(System.in);
    double x1,y1,x2,y2,a,b;
    double x11,x22,y11,y22,p,q;
    public void length(){
        System.out.println("Enter x1: ");
        x1=sc.nextDouble();
        System.out.println("Enter y1: ");
        y1=sc.nextDouble();
        System.out.println("Enter x2: ");
        x2=sc.nextDouble();
        System.out.println("Enter y2: ");
        y2=sc.nextDouble();
        System.out.println("Enter x11: ");
        x11=sc.nextDouble();
        System.out.println("Enter y11: ");
        y11=sc.nextDouble();
        System.out.println("Enter x22: ");
        x22=sc.nextDouble();
        System.out.println("Enter x22: ");
        y22=sc.nextDouble();

        a=Math.pow((x2-x1),2);
        b=Math.pow((y2-y1),2);
        double lengthOfLine1=Math.sqrt(a+b);
        String s1 = String.valueOf(lengthOfLine1);
        System.out.println("Length of Line: "+lengthOfLine1);


        p=Math.pow((x22-x11),2);
        q=Math.pow((y22-y11),2);
        double lengthOfLine2=Math.sqrt(p+q);
        String s2 = String.valueOf(lengthOfLine2);
        System.out.println("Length of Line 2 : "+lengthOfLine2);
        if(s1.equals(s2))
            System.out.println("Both lines are equal");
        else
            System.out.println("Both lines are not equal.");
    }

    public static void main(String[] args) {
        CheckEqualityTwoLines ob = new CheckEqualityTwoLines();
        ob.length();
    }
}
