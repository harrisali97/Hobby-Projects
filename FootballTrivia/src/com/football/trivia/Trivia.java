package com.football.trivia;
import java.util.Scanner;

class Trivia {
    // Array of trivia questions
    private String[] questions = {
        "Who is the highest goalscorer of all time? (First and Second name)",
        "Which country has won the most FIFA World Cup titles?",
        "Who is the fastest recorded player of all time? (First and Second name)",
        "Who won the Champions League in 2015? (2 word response)",
        "Who won the Ballon d'Or in 2020? (First and Second name)"
    };

    // Array of correct answers for the trivia questions
    private String[] answers = {
        "Cristiano Ronaldo",      // Correct answer to question 1
        "Brazil",                 // Correct answer to question 2
        "Thierry Henry",          // Correct answer to question 3
        "Bayern Munich",          // Correct answer to question 4
        "Lionel Messi"            // Correct answer to question 5
    };

    // Method to ask the trivia questions to a player
    public void askQuestions(Player player) {
        Scanner scanner = new Scanner(System.in);  // Scanner for input
        System.out.println(player.getName() + "'s turn!");  // Display player's turn

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);  // Show the current question
            String userAnswer = scanner.nextLine();  // Get player's answer

            // Check if the player's answer is correct
            if (player.answerQuestion(answers[i], userAnswer)) {
                System.out.println("Correct!");  // If correct, display message
                player.incrementScore();  // Increment player's score
            } else {
                System.out.println("Wrong answer. The correct answer is: " + answers[i]);  // Show correct answer if wrong
            }
        }
    }
}
