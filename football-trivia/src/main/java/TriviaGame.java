import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for player 1's name
        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name);  // Create player 1 object

        // Ask for player 2's name
        System.out.print("Enter Player 2's name: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name);  // Create player 2 object

        // Create a Trivia object to hold the question bank
        Trivia trivia = new Trivia();

        // Player 1 goes first
        trivia.askQuestions(player1);  // Player 1's turn

        // Player 2 goes second
        trivia.askQuestions(player2);  // Player 2's turn

        // Display each player's score
        System.out.println(player1.getName() + "'s score: " + player1.getScore());
        System.out.println(player2.getName() + "'s score: " + player2.getScore());

        // Determine the winner based on scores
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");  // Player 1 wins
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");  // Player 2 wins
        } else {
            System.out.println("It's a tie!");  // It's a tie
        }
    }
}
