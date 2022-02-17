/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.awr.rps;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Frizbeee
 */
public class RockPaperScissors {
    
    public static void main(String[] args) {
        
        // Initialise Scanner and variables
        Scanner input = new Scanner(System.in);
        int rounds;
        String choice; 
        // Use a while loop if user wants to play again
        while (true){
            // Prompt for user input
            System.out.println("How many rounds would you like to play?");
            System.out.println("Choose between 1 and 10");
            rounds = Integer.parseInt(input.nextLine());
            // Print error and exit if out side range
            if (rounds > 10 || rounds < 0){
                System.out.println("Error, Outside range");
                System.exit(0);
            }
            
            System.out.println("lets play " + rounds + " rounds");
            // Use method containing the game to play set amount of rounds
            playRPS1(rounds);
            // Prompt the user if they want to play again
            System.out.println("Do you want to play again?");
            System.out.println("(y)es or (n)o");
            choice = input.nextLine();
            // break the loop if player does not want to play, this will exit the programme
            if (choice .equals("n")){
                break;
            }
            
        }
        
    }
    // Method for the game involving parameter
    public static void playRPS1(int rounds){
        // Initialise scanner, random and variables.
        Scanner input = new Scanner(System.in);
        Random randomiser = new Random();
        // Variables to track number of userwins, computerwins and ties
        int uwin = 0;
        int cwin = 0;
        int ties = 0;
        // for loop to play number of rounds picked by user
        for (int i=0; i<rounds; i++){
            // initialise user and computer move variables
            int usermove;
            int compmove;
            // prompt user for their move
            System.out.println("What is your move?");
            System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors");
            usermove = Integer.parseInt(input.nextLine());
            // generate random move to be played by the computer
            compmove = randomiser.nextInt(3)+1;
            // if else if statements to determine winner and track score
            if (compmove == usermove){
                ties += 1;
                System.out.println( "Tied this round");
            } else if (compmove == 1 && usermove == 2){
                uwin += 1;
                System.out.println( "User Wins this roun");
            } else if (compmove == 1 && usermove == 3){
                cwin += 1;
                System.out.println( "Computer Wins this roun");
            } else if (compmove == 2 && usermove == 1){
                cwin += 1;
                System.out.println( "Computer Wins this roun");
            } else if (compmove == 2 && usermove == 3){
                uwin += 1;
                System.out.println( "User Wins this roun");
            } else if (compmove == 3 && usermove == 1){
                cwin += 1;
                System.out.println( "Computer Wins this round");
            } else if (compmove == 3 && usermove == 2){
                uwin += 1;
                System.out.println( "User Wins this round");
            }
                          
            //if else if statements to determine overall winner
            
        }
        
        if (cwin == uwin){
            System.out.println("It's a tie");
        } else if (cwin >= uwin){
            System.out.println("Computer wins the game");
        } else if (uwin >= cwin){
            System.out.println("You win the game");
        }
        System.out.println("User won " + uwin + " times");
        System.out.println("Computer won " + cwin + " times");
        System.out.println("There were " + ties + " ties");
       
    }
    
}
