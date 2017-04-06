/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prompter;

import java.util.Scanner;

/**
 *
 * @author ermaz0018
 */
public class Prompter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int min;
     int max = 0;
     int middle = 0;
     
     //Minimum check
     System.out.println("Please enter a minimum number: ");
     min = input.nextInt();
     
     //Maximum check
     do{
         System.out.println("Please enter a maximum number: ");
         max = input.nextInt();
     } while(max <= min); //when maximum is lower than the minimum it will ask again with the above loop(The do)
     
     //Middle Check
     do{
     System.out.println("Please enter a number in between the minimum and maximum: ");
     middle = input.nextInt();
     } while(middle >= max || middle <= min); //Whem the middle number goes outside of the previously set range, it will ask again with the loop
     //Congrats
     System.out.println("Thank you, good job.");
    }
    
}
