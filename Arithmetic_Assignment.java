/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic_assignment;

/**
 *
 * @author garret grimes
 */
import java.util.Scanner;
public class Arithmetic_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanstr = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        
        //User inputs
        System.out.println("What is the total cost of a 4 year college?");
        int college = scanint.nextInt();
        System.out.println("How much money can you save in a month for this college");
        int money = scanint.nextInt();
        System.out.println("How much additional gift money or scholarship will be given to you?");
        int gift = scanint.nextInt();
        System.out.println("How many more years until you can attend this college?");
        int years = scanint.nextInt();
        
        //Calculations
        int yearsavings = (money * 12);
        int totalsavings = (yearsavings * years);
        int allsavings = (college + gift);
        int difference = (college - allsavings);
        
        //Outputs
        System.out.println("Total cost of the 4 year college:");
        System.out.println(college);
        System.out.println("Total money you can save per year:");
        System.out.println(yearsavings);
        System.out.println("Given the number of years until you start college, how much money would you have saved:");
        System.out.println(totalsavings);
        System.out.println("How much in total money do you have including gifts and scholarship?:");
        System.out.println(allsavings);
        System.out.println("Overall how much money more money is needed to attend the college or how much is the surplus:");
        System.out.println(difference);
        
        
        
    }
    
}
