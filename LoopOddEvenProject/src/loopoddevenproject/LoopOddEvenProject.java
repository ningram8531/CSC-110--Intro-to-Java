//Program Name: Loop Odd Even Project
//Author: Nick Ingram
//Class: CSC 110 32035
//Date: 04/24/2022
//Description: Prints out pairs of odd and even numbers 
// then prints the squareroot of the sum of the two numbers.
package loopoddevenproject;

public class LoopOddEvenProject {


    public static void main(String[] args) {
        
            int i = 0;
            double sqrt = 0;
            double even = 0;
            double odd = 0;
        
            for (i = 0; i < 173; i+=2) {
            sqrt = (Math.sqrt(i + 1 + i));
            even = 0 + i;
            odd = 1 + i;
            
            /*Prints out the odds, evens, and sqrt of sum 
            rounded to 4 decimals. Tabs are printed separate.
            */
            System.out.printf("%.4f" , odd);
            System.out.print("\t");
            System.out.printf("%.4f" , even);  
            System.out.print("\t");
            System.out.printf("%.4f",sqrt);
            System.out.print("\n");
            
        }
        
    }
    
}
/*  LAST 10 LINES OF OUTPUT
153.0000	152.0000	17.4642
155.0000	154.0000	17.5784
157.0000	156.0000	17.6918
159.0000	158.0000	17.8045
161.0000	160.0000	17.9165
163.0000	162.0000	18.0278
165.0000	164.0000	18.1384
167.0000	166.0000	18.2483
169.0000	168.0000	18.3576
171.0000	170.0000	18.4662
173.0000	172.0000	18.5742
BUILD SUCCESSFUL (total time: 0 seconds)
*/