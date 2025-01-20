package com.football.trivia;
class Player {
    private String name;  // Player's name
    private int score;    // Player's score

    // Constructor to initialise player's name and score
    public Player(String name) {
        this.name = name;
        this.score = 0;  // Start score from 0
    }

    // Getter for player's name
    public String getName() {
        return name;
    }

    // Getter for player's score
    public int getScore() {
        return score;
    }

    // Method to increment player's score by 1
    public void incrementScore() {
        score++;  // Add 1 to score
    }

    // Method to check if the player's answer is correct (case-insensitive)
    public boolean answerQuestion(String correctAnswer, String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);  // Compare answers
    }
}
