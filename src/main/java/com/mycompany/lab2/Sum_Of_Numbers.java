package com.mycompany.lab2;
import java.util.Scanner;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
   System.out.println("Enter a positive number: ");  
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int x = 0;
    for(int y = 0;y <= n; y++)
    {  x=x+y;
    }
 System.out.println("The sum is " + x);
    }
}
