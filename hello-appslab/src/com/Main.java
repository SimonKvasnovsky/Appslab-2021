package com;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while(true) {

            System.out.print("Type rock, paper or scissors: ");
            String myMove = in.nextLine();

            if(myMove.equals("quit")) {
                break;
            }

            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

                System.out.println("Your move is wrong, try rock,paper or scissors");

            } else {


                int rand = (int)(Math.random()*3);

                String opponentMove = "";
                if(rand == 0) {
                    opponentMove = "rock";
                } else if(rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent's move: " + opponentMove);

                if(myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }

            }

        }

    }
}