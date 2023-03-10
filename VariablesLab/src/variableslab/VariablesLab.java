//Program Name: VariablesLab
//Author: Nick Ingram
//Class: CSC 110 32035
//Date: 02/18/2022
//Description: Introduces variables and performs various math equations that
//tells us the difference in pay of a boss vs a cook.
package variableslab;


public class VariablesLab {


    public static void main(String[] args) {
        
        int bossSalary;
        short cookSalary; 
        double bossPayPeriod;
        int cookPayPeriod;
        boolean bossIsAJerk;
        double bossWeekPay;
        double cookWeekPay;
        
        bossSalary = 120196;
        cookSalary = 20196;
        bossPayPeriod = 52.0;
        cookPayPeriod = 52;
        bossIsAJerk = true;        
        
        //Prints a sentence detailing the boss's salary
        System.out.print("Boss's Salary is " + bossSalary + "\n"); 
       
        //Prints a sentence detailing the cook's salary
        System.out.print("Cook's salary is " + cookSalary + "\n");
        
        //Prints if the boss is a jerk or not
        System.out.print("The boss is a jerk. " + bossIsAJerk + "\n");
        
        //Printz the amount of money the boss is paid each pay period
        System.out.print("The Boss's paycheck is ");
        System.out.print(bossSalary / bossPayPeriod);
        System.out.print("\n");
        
        //Prints the amount the cook is paid per pay period
        System.out.print("The cook's paycheck is ");
        System.out.print(cookSalary / cookPayPeriod);
        System.out.print("\n");
        
        //Assigns the cook's salary to the boss's salary
        cookSalary = (short) bossSalary;
        
        //States the cook's new salary
        System.out.print("The cook's new salary is " + cookSalary + "\n");
        
        
        
        
        
                
                
        
    }
    
}
//Program Output:
//Boss's Salary is 120196
//Cook's salary is 20196
//The boss is a jerk. true
//The Boss's paycheck is 2311.4615384615386
//The cook's paycheck is 388
//The cook's new salary is -10876
//BUILD SUCCESSFUL (total time: 0 seconds) 
//The first anomaly is the cook's new salary becuase no one gets paid 10876... 
//It happened because the amount of data for a short isn't able to handle the
//boss's pay amount. 
//The second anomaly is the cooks current paycheck used integer division 
//so it threw away the cents portion
