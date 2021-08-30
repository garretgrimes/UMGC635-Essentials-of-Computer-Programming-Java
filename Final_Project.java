/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

/**
 *
 * @author garret grimes
 */
import java.util.Scanner;
public class Final_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanint = new Scanner(System.in);
        Scanner scandouble = new Scanner(System.in);
        
        double taxes[];
        taxes = new double[13];
        
        System.out.println("Enter wages, salaries, and tips earned by the husband:");
        taxes[0] = (int) scanint.nextDouble();
        
        System.out.println("Enter wages, salaries, and tips earned by the wife:");
        taxes[1] = (int) scanint.nextDouble();
        
        System.out.println("Bonus earned by the family combined:");
        taxes[2] = (int) scanint.nextDouble();
        
        taxes[3] = taxes[0] + taxes[1] + taxes[2];
        System.out.println("This is your yearly gross income: ");
        System.out.println(taxes[3]);
        
        taxes[4] = 5000;
        
        taxes[5] = taxes[3] - taxes[4];
        System.out.println("This is your taxable income: ");
        System.out.println(taxes[5]);
        
        System.out.println("Federal income tax withheld for husband: ");
        taxes[6] = (int) scanint.nextDouble();
        
        System.out.println("Federal income tax withheld for wife: ");
        taxes[7] = (int) scanint.nextDouble();
        
        taxes[8] = taxes[6] + taxes[7];
        System.out.println("This is your total payments and credits: ");
        System.out.println(taxes[8]);
        
        taxes[9] = (int) (taxes[5] * 0.28);
        System.out.println("Total Federal Tax");
        System.out.println(taxes[9]);
        
        System.out.println("Property tax to be owed: ");
        taxes[10] = (int) scanint.nextDouble();
        
        taxes[11] = taxes[9] + taxes [10];
        System.out.println("This is your total tax: ");
        System.out.println(taxes[11]);
        
        taxes[12] = taxes[11] - taxes[8];
        System.out.println("If result is positive, it is the amount you have to pay. If result is negative, it is the amount you have overpaid: ");
        System.out.println(taxes[12]);
        
                
    }
    
}
