class Player {
    private String name;  // Player's name
    private int score;    // Player's score

    // Constructor to initialize player's name and set score to 0
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Getter method to return player's name
    public String getName() {
        return name;
    }

    // Getter method to return player's score
    public int getScore() {
        return score;
    }

    // Method to increment the player's score by 1
    public void incrementScore() {
        score++;  // Increase the score by 1
    }

    // Method to check if the player's answer matches the correct answer
    public boolean answerQuestion(String correctAnswer, String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);  // Case-insensitive comparison
    }
}
