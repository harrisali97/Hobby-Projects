// Nightlife class, a specific type of Attraction
class Nightlife extends Attraction {

    // Constructor to initialise a Nightlife
    public Nightlife(String name, String description, String location) {
        super(name, description, location); // Call parent class constructor
    }

    // Implement the abstract displayInfo method to show details of the nightlife
    @Override
    public void displayInfo() {
        System.out.println("Nightlife: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
