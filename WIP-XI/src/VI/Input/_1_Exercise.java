/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int moneyFather;
         int moneyMother;
         
        System.out.print("Enter money from Father : ");

        moneyFather = sc.nextInt();
        
        System.out.print("Enter money from Mother : ");

        moneyMother = sc.nextInt();
        
               
        System.out.println("Total money = " + (moneyFather+moneyMother));
    }
}
