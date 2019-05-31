/*
 * WIP XI Computer Programing 
 */

package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = 0;
        int limit = 10;
        int menu;
        while(item < limit){
        System.out.println("1. Add item\n2. Remove item\n3. Check item");
        System.out.print("item : ");
        item = sc.nextInt();
        System.out.print("limit : ");
        limit = sc.nextInt();
        System.out.print("menu : ");
        menu = sc.nextInt();
        
        if(menu == 1){
            if(item<limit){
                int amount;
                System.out.print("amount : ");
                amount = sc.nextInt();
                if((item + amount)>limit){
                    System.out.println("item เกิน limit\n");
                }
                else {
                    //System.out.println("item : " +(item+amount) "limit : " + limit);
                    System.out.printf("item : %d \nlimit : %d\n",item+amount,limit);
                }
            }
            else {
                System.out.println("item เต็มแล้ว\n");
            }
        }
        else if(menu == 2){
            if(item == 0){
             
                System.out.print("ไม่มี item ในโกดัง\n");
                
                }
            else {
                int amount2;
                System.out.print("amount : ");
                amount2 = sc.nextInt();
                if(amount2>item){
                    System.out.println("item ไม่พอ\n");  
                }
                else {
                System.out.printf("item : %d\nlimit : %d\n",item-amount2,limit);
            }
                
            }
        }
        else if(menu == 3){
            System.out.printf("item : %d\nlimit : %d\n",item,limit);
        }
        System.out.printf("\n");
        }
        
        
        
        

    }
}
