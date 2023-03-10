//Program Name: ContainerProject
//Author: Nick Ingram
//Class: CSC 110 32035
//Date: 03/06/2022
//Description: Sorts widgets in containers based on a cost effective format
// and prints out the price and the amount of containers required.

package containerproject;

import java.util.Scanner;

public class ContainerProject {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner (System.in);
       
       int widgets = scnr.nextInt();
       
       final int HUGE_C;
       final int LARGE_C;
       final int MEDIUM_C;
       final int SMALL_C;
       
       /* Prints out the header and sets up the table 
       for organizing the containers' numbers
       */
        System.out.println("Widget Manufacturing Company \n");
        System.out.println("Container Information Program \n");
        System.out.print("Enter the number of widgets to be shipped: ");
        System.out.println(widgets + "\n");
        System.out.println("Container(s)     Number\n");
        System.out.println("============     ======");
        
        /* Defining the Integer and subtracting the container capacity 
        from the total widgets. This process repeats for each type of container
        until line 57.
        */
        HUGE_C = widgets / 50;
        System.out.print("Huge               ");
        System.out.println(HUGE_C);
        widgets = widgets - (HUGE_C * 50); 
        
        LARGE_C = widgets / 20;
        System.out.print("Large              ");
        System.out.println(LARGE_C);
        widgets = widgets - (LARGE_C * 20);
        
        MEDIUM_C = widgets / 5;
        System.out.print("Medium             ");
        System.out.println(MEDIUM_C);
        widgets = widgets - (MEDIUM_C * 5);
        
        SMALL_C = (widgets / 1);
        System.out.print("Small              ");
        System.out.print(SMALL_C + "\n");
        
        //Calculates and prints price of the containers
        double totalCost;
        totalCost = ((HUGE_C * 35.00) + (LARGE_C * 15.25) + 
                (MEDIUM_C * 4.25) + (SMALL_C * .95));
        System.out.print("============     ====== \n");
        
        System.out.print("Total Cost:      $" + totalCost + "\n");
        
        
    }
    
}

/*
Widget Manufacturing Company 

Container Information Program 

Enter the number of widgets to be shipped: 76

Container(s)     Number

============     ======
Huge               1
Large              1
Medium             1
Small              1
============     ====== 
Total Cost:      $55.45
BUILD SUCCESSFUL (total time: 2 seconds)

*/