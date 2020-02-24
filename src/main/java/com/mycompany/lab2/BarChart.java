package com.mycompany.lab2;
import java.util.Scanner;

public class BarChart {
     public static void main(String[] args) {
       
       int NumberOfStores = 5;
       String UserInput;
       double StoreSales;
       int Convesion;
       String Output = "Sales Chart";
       Scanner sc = new Scanner(System.in);
       for (int store = 1; store<=NumberOfStores; store++){
           System.out.print("Enter today's salaes for store " + store);
           UserInput = sc.nextString();
           StoreSales=Double.parseDouble(UserInput);
           Convesion = (int)/(StoreSales/100);
           Output+
       }
             
       
     }
}