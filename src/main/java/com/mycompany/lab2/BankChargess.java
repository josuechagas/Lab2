package com.mycompany.lab2;

import java.util.Scanner;
public class BankChargess {

    public static void main(String[] args)
{

float Numberofchecks ;
double VariableFee, TotalFee;
int FixedFee = 10;

 Scanner sc = new Scanner(System.in);
    {
     System.out.print("Enter the number of checks used during the month : ");
     Numberofchecks = sc.nextFloat();
   
    if (Numberofchecks >= 60 )
    {
    VariableFee = 0.04;
    System.out.println("Banks service fees for the month: " + (VariableFee*Numberofchecks)+ FixedFee);
    }
               
    else if (Numberofchecks >= 40 && Numberofchecks <= 59)
   {
    VariableFee = 0.06;
    TotalFee = (VariableFee*Numberofchecks)+FixedFee;
    System.out.println("Banks service fees for the month: $" + TotalFee);
    }
                
    else if (Numberofchecks >= 20 && Numberofchecks <= 39)
    {
    VariableFee = 0.08;
    TotalFee = (VariableFee*Numberofchecks)+FixedFee;
    System.out.println("Banks service fees for the month: $" + TotalFee);
    }
               
    else if (Numberofchecks < 20)
     {
    VariableFee = 0.1;
    TotalFee = (VariableFee*Numberofchecks)+FixedFee;
    System.out.println("Banks service fees for the month: $" + TotalFee);
    }       
    }
}
}
