package com.football.trivia;

import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        // Create a scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask for Player 1's name
        System.out.print("Player 1, what is your name? ");
        String player1Name = scanner.nextLine();  // Read Player 1's name
        Player player1 = new Player(player1Name);  // Create Player 1 object

        // Ask for Player 2's name
        System.out.print("Player 2, what is your name? ");
        String player2Name = scanner.nextLine();  // Read Player 2's name
        Player player2 = new Player(player2Name);  // Create Player 2 object

        // Create a Trivia object to hold the question bank
        Trivia trivia = new Trivia();

        // Player 1 goes first
        trivia.askQuestions(player1);  // Ask trivia questions for Player 1

        // Player 2 goes second
        trivia.askQuestions(player2);  // Ask trivia questions for Player 2

        // Display the final scores
        System.out.println(player1.getName() + "'s score: " + player1.getScore());
        System.out.println(player2.getName() + "'s score: " + player2.getScore());

        // Determine and display the winner based on scores
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");  // Player 1 wins
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");  // Player 2 wins
        } else {
            System.out.println("It's a tie!");  // It's a tie
        }
    }
}
