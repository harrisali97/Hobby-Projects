// Restaurant class, a specific type of Attraction
class Restaurant extends Attraction {

    // Constructor to initialise a Restaurant
    public Restaurant(String name, String description, String location) {
        super(name, description, location); // Call parent class constructor
    }

    // Implement the abstract displayInfo method to show details of the restaurant
    @Override
    public void displayInfo() {
        System.out.println("Restaurant: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
