// Park class, a specific type of Attraction
class Park extends Attraction {

    // Constructor to initialize a Park
    public Park(String name, String description, String location) {
        super(name, description, location); // Call parent class constructor
    }

    // Implement the abstract displayInfo method to show details of the park
    @Override
    public void displayInfo() {
        System.out.println("Park: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
