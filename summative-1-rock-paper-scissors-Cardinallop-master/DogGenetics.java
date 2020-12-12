/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boburmurtozaev.doggenetics;

/**
 *
 * @author boburmurtozaev
 */
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        boolean driver = true; //driver runs the program as many times as the user wants
        String trial;

        do {
            //dog breed name(shortened)
            String dogName;
            int st;
            int ch;
            int dr;
            int cc;
            int kd;
            int sum;
            int count = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("What's your dog's name?");

            dogName = scan.nextLine();

            System.out.println("\nWell then, "
                    + "I have this highly reliable report on Sir "
                    + "" + dogName + "'s prestigious background right here.\n\n");
            System.out.println("Sir " + dogName + " is:\n\n");

            while (true) {

                st = (int) (Math.random() * 100);
                ch = (int) (Math.random() * 100);
                dr = (int) (Math.random() * 100);
                cc = (int) (Math.random() * 100);
                kd = (int) (Math.random() * 100);
                sum = (st + ch + dr + cc + kd);
                count++; //shows how many times the loop ran to find the perfect combination

                if (sum == 100) {
                    break; //the loop stops whenever the sum is equal to 100, otherwise keep trying to find the perfect combination
                }

            }

            System.out.println("Research run count: " + count);

            System.out.println(st + "% St. Bernard\n" + ch + "% "
                    + "Chihuaha\n" + dr + "% Dramatic RedNosed "
                    + "Asian Pug\n" + cc + "% Common Cur\n" + kd + "% "
                    + "King Doberman\n\nWow, that's QUITE the dog!\n\n");

            System.out.println("Try again?");

            while (true) {
                trial = scan.next();
                if ((trial.equalsIgnoreCase("no")) || (trial.equalsIgnoreCase("yes"))) {
                    break;
                } else {
                    System.out.println("Please, type in either yes or no");
                }
            }
            if (trial.equalsIgnoreCase("no")) {
                //break bigloop;// you can use named break points to break of out certain loops
                driver = false;
            } else if (trial.equalsIgnoreCase("yes")) {
                System.out.println("Initiating genetic analysis.....");
                driver = true;

            }

        } while (driver);

    }

}
