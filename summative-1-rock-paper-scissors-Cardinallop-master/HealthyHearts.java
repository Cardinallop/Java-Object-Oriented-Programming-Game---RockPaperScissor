/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthyHearts;

/**
 *
 * @author boburmurtozaev
 */
import java.util.Scanner;

public class HealthyHearts {
    
    public static void main(String[] args){
        int age;
        boolean round = false;
        String tryagain;
        Scanner scan = new Scanner(System.in);
        
        do{
        
        System.out.println("What is your age?");
        
        while(true){
                try{
                    age = Integer.parseInt(scan.next());
                    
                    if((age<150)&&(age>=1)){
                        break;
                    }else{
                        System.out.println("Please, enter a normal human age:");
                    }
                    
                }catch(Exception e){
                    System.out.println("Please, enter a normal human age:");
                }
            }
        
        System.out.println("Your maximum heart rate should be "+(220-age)+" beats per minute");
        System.out.println("Your target HR Zone is 85 - "+Math.round((int)(0.85*(220-age)))+" beats per minute");
        
        System.out.println("Do you want to try again? Yes/No: ");
        
         while (true) {
                tryagain = scan.next();
                if ((tryagain.equalsIgnoreCase("no")) || (tryagain.equalsIgnoreCase("yes"))) {
                    break;
                } else {
                    System.out.println("Please, type in either yes or no");
                }
            }
            if (tryagain.equalsIgnoreCase("no")) {
                //break bigloop;// you can use named break points to break of out certain loops
                round = false;
            } else if (tryagain.equalsIgnoreCase("yes")) {
                System.out.println("Restarting.....");
                round = true;

            }
        
        }while(round);
        
    }
    
}
