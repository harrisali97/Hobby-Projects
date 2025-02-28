// Nightlife class, a specific type of Attraction
class Nightlife extends Attraction {

    // Constructor to initialise a Nightlife object
    public Nightlife(String name, String description, String location) {
        super(name, description, location); // Call parent class constructor
    }

    // Implement the abstract displayInfo method to show details of the nightlife object
    @Override
    public void displayInfo() {
        System.out.println("Nightlife: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
