
package com.mycompany.lab2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args)
{

float Grade1, Grade2, Grade3, AverageGrade;
char letterGrade;

 Scanner sc = new Scanner(System.in);
    {
     System.out.print("Enter first test score: ");
     Grade1 = sc.nextFloat();
     System.out.print("Enter second test score: ");
     Grade2 = sc.nextFloat();
     System.out.print("Enter third test score: ");
     Grade3 = sc.nextFloat();
                
    AverageGrade = (Grade1 + Grade2 + Grade3)/3;
    System.out.println("Average score: " + AverageGrade);
   
    if (AverageGrade >= 90 )
    {
    letterGrade ='A';
    System.out.println("Letter grade: " + letterGrade);
    }
               
    else if (AverageGrade >= 80 && AverageGrade <= 89)
   {
    letterGrade = 'B';
    System.out.println("Letter grade: " + letterGrade);
    }
                
    else if (AverageGrade >= 70 && AverageGrade <= 79)
   {
    letterGrade = 'C';
    System.out.println("Letter grade: " + letterGrade);
    }
               
    else if (AverageGrade >= 60 && AverageGrade <= 69)
    {
    letterGrade = 'D';
    System.out.println("Letter grade: " + letterGrade);
    }
               
    else if (AverageGrade < 60)
    {
    letterGrade = 'F';
    System.out.println("Letter grade: " + letterGrade);
    }           
    }
}
}
