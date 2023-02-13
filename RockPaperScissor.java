//package com.company;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Welcome to Rock-Paper-Scissor game!!");
        System.out.println("Please Choose one item from Rock,Paper and Scissor");


        String userInput = "";
        String computerInput = "";
        userInput = sc.nextLine();
        int num = ran.nextInt(3);
        if(num==0){
            computerInput = "Rock";
            System.out.println("Computer chooses Rock");
        }
        if(num==1){
            computerInput = "Paper";
            System.out.println("Computer chooses Paper");
        }
        if(num==2){
            computerInput = "Scissor";
            System.out.println("Computer chooses Scissor");
        }


        // For Tie Game
        if(computerInput.equals(userInput)){
            System.out.println("Game is Tied");
        }

        // For User winning it
        else if(computerInput.equals("Rock") && userInput.equals("Paper")){
            System.out.println("User wins...!!!");
        }

        else if(computerInput.equals("Paper") && userInput.equals("Scissor")){
            System.out.println("User wins...!!!");
        }
        else if(computerInput.equals("Scissor") && userInput.equals("Rock")){
            System.out.println("User wins...!!!");
        }

        // For Computer winning it
        else if(computerInput.equals("Paper") && userInput.equals("Rock")){
            System.out.println("Computer wins...!!!");
        }

        else if(computerInput.equals("Scissor") && userInput.equals("Paper")){
            System.out.println("Computer wins...!!!");
        }
        else if(computerInput.equals("Rock") && userInput.equals("Scissor")){
            System.out.println("Computer wins...!!!");
        }



    }
}
// https://www.youtube.com/watch?v=wux_u6NXxq0