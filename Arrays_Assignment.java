/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_assignment;

/**
 *
 * @author garret grimes
 */
import java.util.Scanner;
public class Arrays_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanstr = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        
        //User Inputs
        String name[];
        name = new String[2];
        
        System.out.println("Weight Loss Challenge Tracker");
        System.out.println("Enter the name of the first member?: ");
        name[0] = scanstr.nextLine();
        System.out.println("Enter the name of the second member?: ");
        name[1] = scanstr.nextLine();

        int weight[];
        weight = new int[10];

        System.out.println("How many pounds did " + name[0] + " lose in January:");
        weight[0] = scanint.nextInt();
        System.out.println("How many pounds did " + name[1] + " lose in January:");
        weight[1] = scanint.nextInt();

        System.out.println("How many pounds did " + name[0] + " lose in February:");
        weight[2] = scanint.nextInt();
        System.out.println("How many pounds did " + name[1] + " lose in February:");
        weight[3] = scanint.nextInt();

        System.out.println("How many pounds did " + name[0] + " lose in March:");
        weight[4] = scanint.nextInt();
        System.out.println("How many pounds did " + name[1] + " lose in March:");
        weight[5] = scanint.nextInt();

        System.out.println("How many pounds did " + name[0] + " lose in April:");
        weight[6] = scanint.nextInt();
        System.out.println("How many pounds did " + name[1] + " lose in April:");
        weight[7] = scanint.nextInt();

        System.out.println("How many pounds did " + name[0] + " lose in May:");
        weight[8] = scanint.nextInt();
        System.out.println("How many pounds did " + name[1] + " lose in May:");
        weight[9] = scanint.nextInt();
        
        int totala = (weight[0] + weight[2] + weight[4] + weight[6] + weight [8]);
        int totalb = (weight[1] + weight[3] + weight[5] + weight[7] + weight [9]);
        
        System.out.println(name[0]+ " lost a total weight of " + totala + " pounds over 5 months.");
        System.out.println(name[1]+ " lost a total weight of " + totalb + " pounds over 5 months.");  
        

        

    }
    
}
