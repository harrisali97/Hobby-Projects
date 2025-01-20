import java.util.Scanner;

class Trivia {
    // Array of trivia questions
    private String[] questions = {
        "Who is the highest goalscorer of all time? (First and Second name)",
        "Which country has won the most FIFA World Cup titles?",
        "Who is the fastest recorded player of all time?",
        "Who won the Champions League in 2015? (2 word response)",
        "Who won the Ballon d'Or in 2020?"
    };

    // Array of correct answers
    private String[] answers = {
        "Cristiano Ronaldo",      // Correct answer to the first question
        "Brazil",                 // Correct answer to the second question
        "Thierry Henry",          // Correct answer to the third question
        "Bayern Munich",          // Correct answer to the fourth question
        "Lionel Messi"            // Correct answer to the fifth question
    };

    // Method to ask questions to a player
    public void askQuestions(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + "'s turn!");  // Display player turn

        // Loop through all the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);  // Display the question
            String userAnswer = scanner.nextLine();  // Get player's answer

            // Check if the player's answer is correct
            if (player.answerQuestion(answers[i], userAnswer)) {
                System.out.println("Correct!");  // Correct answer
                player.incrementScore();  // Increase score if correct
            } else {
                System.out.println("Wrong answer. The correct answer is: " + answers[i]);  // Incorrect answer
            }
        }
    }
}
