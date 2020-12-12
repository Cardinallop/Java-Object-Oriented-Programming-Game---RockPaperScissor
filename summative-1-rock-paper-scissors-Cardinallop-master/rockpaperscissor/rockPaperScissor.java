/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author boburmurtozaev
 */
public class rockPaperScissor {

    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rounds;
        int userPick;
        int computerPick;
        int userWin = 0;
        int userLoss = 0;
        int compWin = 0;
        int compLoss = 0;
        int bothTie = 0;
        String playMore;

        //Naming the loops actually are very helpful
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        bigloop:
        do {

            System.out.println("Welcome to Rock, Paper, Scissor Game!\nHow many rounds do you want to play?\nYou must choose up to 10 rounds");
            while(true){
                try{
                    rounds = Integer.parseInt(scan.next());
                    break;
                }catch(Exception e){
                    System.out.println("Please, enter a valid number between 1 and 10");
                }
            }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
            
            
            
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // Put a code here in Java to check whether the input is a number or a letter
            // Too many input instances causing the code get longer
            while ((rounds < 1) || (rounds > 10)) {
                System.out.println("You've entered a number outside range");
                System.out.println("The game is over!");
                System.out.println("Do you want to play again?");
                System.out.println("Type in yes or no into the console:");
                 while(true){
                    playMore = scan.next();
                    if((playMore.equalsIgnoreCase("no"))||(playMore.equalsIgnoreCase("yes"))){
                        break;
                    }else{
                        System.out.println("Please, type in either yes or no");
                    }
            }
                if (playMore.equalsIgnoreCase("no")) {
                    break bigloop;// you can use named break points to break of out certain loops
                } else if (playMore.equalsIgnoreCase("yes")) {
                    System.out.println("How many rounds woud you like to to play?");
                    while(true){
                try{
                    rounds = Integer.parseInt(scan.next());
                    break;
                }catch(Exception e){
                    System.out.println("Please, enter a valid number");
                }
            }
                }
                    //logic works by creating a new data in every step of the code flow
                   
            }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
            
            
            
            
            
            
       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
            System.out.println("You have "+rounds+" rounds to play:");
            while ((rounds >= 1) && (rounds <= 10)) {
                System.out.println("\n");
                System.out.println("Pick your choice:\nEnter\n1 for Rock\n2 for Paper\n3 for Scissor:");
                System.out.println("\n");
                 while(true){
                try{
                    userPick = Integer.parseInt(scan.next());
                    if((userPick==1)||(userPick==2)||(userPick==3)){
                        break;
                    }
                    System.out.println("You must pick a number from 1 to 3");
                }catch(Exception e){
                    System.out.println("You must pick a number from 1 to 3");
                }
            }
                if (userPick == 1) {
                    System.out.println("You have picked: Rock!");
                }
                if (userPick == 2) {
                    System.out.println("You have picked: Paper!");
                }
                if (userPick == 3) {
                    System.out.println("You have picked: Scissor!");
                }
                computerPick = (int)(Math.random()*3+1);
                //beware of a lot of repetition downward...
                if(computerPick==1){
                    System.out.println("Computer picked Rock!");
                    if(userPick==2){
                        System.out.println("Paper wraps Rock!");
                        System.out.println("You win! Computer lost...");
                        userWin++;
                        compLoss++;
                    }
                    if(userPick==3){
                        System.out.println("Rock breaks Scissor!");
                        System.out.println("You lost! Computer won...");
                        userLoss++;
                        compWin++;
                    }
                    if(userPick==1){
                        System.out.println("It's a tie!");
                        bothTie++;
                    }
                }
                if(computerPick==2){
                    System.out.println("Computer picked Paper!");
                    if(userPick==1){
                        System.out.println("Paper wraps Rock!");
                        System.out.println("You lost! Computer won...");
                        userLoss++;
                        compWin++;
                    }
                    if(userPick==3){
                        System.out.println("Scissor cuts Paper!");
                        System.out.println("You won! Computer lost...");
                        userWin++;
                        compLoss++;
                    }
                    if(userPick==2){
                        System.out.println("It's a tie!");
                        bothTie++;
                    }
                }
                if(computerPick==3){
                    System.out.println("Computer picked Scissor!");
                    
                    if(userPick==2){
                        System.out.println("Scissor cuts Paper!");
                        System.out.println("You lost! Computer win...");
                        userLoss++;
                        compWin++;
                    }
                    if(userPick==1){
                        System.out.println("Rock breaks Scissor!");
                        System.out.println("You won! Computer lost...");
                        userWin++;
                        compLoss++;
                    }
                    if(userPick==3){
                        System.out.println("It's a tie!");
                        bothTie++;
                    }
                }
                System.out.println("Rounds left: "+(--rounds));
            }
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            
            
            
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("No more rounds left to play!");
            System.out.println("\n");
            System.out.println("Summary: ");
            System.out.println("You have won " + userWin+" rounds");
            System.out.println("Computer won " + compWin+" rounds");
            System.out.println("\n");
            if(userWin>compWin){
                System.out.println("The ultimate champion is You!\nCongratulations!");
            }else if(userWin<compWin){
                System.out.println("The ultimate champ is your Computer! However, do not be saddened! Try again!");
            }else{
                System.out.println("Both you and computer were equally strong. It is an ultimate Tie!");
            }
            
            System.out.println("Would you like to play again? Type in either yes or no");
             while(true){
                    playMore = scan.next();
                    if((playMore.equalsIgnoreCase("no"))||(playMore.equalsIgnoreCase("yes"))){
                        break;
                    }else{
                        System.out.println("Please, type in either yes or no");
                    }
            }
              if (playMore.equalsIgnoreCase("no")) {
                    //break bigloop;// you can use named break points to break of out certain loops
                    rounds = 0;
                } else if (playMore.equalsIgnoreCase("yes")) {
                    System.out.println("Restarting the game.....");
                    rounds = 1;
                   
                }
        } while ((rounds > 0) && (rounds < 11));
        System.out.println("Game Over!");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
