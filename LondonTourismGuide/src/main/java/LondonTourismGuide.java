import java.util.ArrayList;
import java.util.Scanner;

public class LondonTourismGuide {

    // Scanner object made for user input
    private static Scanner scanner = new Scanner(System.in);

    // List made to store saved attractions
    private static ArrayList<Attraction> savedAttractions = new ArrayList<>();

    // Create an instance of the factory to create attractions
    private static TouristAttractionFactory factory = new TouristAttractionFactory();

    // Method to display and save attractions in a category
    private static void showAttractions(String category, ArrayList<? extends Attraction> attractions) {
        System.out.println("Would you like to explore " + category + "? (yes/no)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes")) {
            // Loop through attractions and show info
            for (Attraction attraction : attractions) {
                attraction.displayInfo();
                System.out.println("Would you like to save this " + category.toLowerCase() + "? (yes/no)");
                String saveResponse = scanner.nextLine().toLowerCase();
                if (saveResponse.equals("yes")) {
                    savedAttractions.add(attraction); // Add to saved list
                    System.out.println("This " + category.toLowerCase() + " has been saved!");
                }
            }
        } else {
            System.out.println("Skipping " + category);
        }
    }

    // Display saved attractions at the end
    private static void showSavedAttractions() {
        if (savedAttractions.isEmpty()) {
            System.out.println("You didn't save any attractions.");
        } else {
            System.out.println("Your saved attractions are:");
            for (Attraction savedAttraction : savedAttractions) {
                savedAttraction.displayInfo();  // Show info of each saved attraction
            }
        }
        System.out.println("Thank you for using the London Tour Guide! Enjoy your trip!");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Ask the user about each category and display the attractions
        showAttractions("Historical Sites", factory.createHistoricalSites());
        showAttractions("Restaurants", factory.createRestaurants());
        showAttractions("Parks", factory.createParks());
        showAttractions("Nightlife", factory.createNightlife());

        // Show the list of saved attractions at the end
        showSavedAttractions();
    }
}
