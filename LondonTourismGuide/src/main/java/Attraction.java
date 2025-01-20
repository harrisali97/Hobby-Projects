// Base class for any tourist attraction
abstract class Attraction {
    String name;       // Name of the attraction
    String description; // Description of the attraction
    String location;    // Location of the attraction

    // Constructor to initialise attraction details
    public Attraction(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    // Abstract method to display information about the attraction
    public abstract void displayInfo();
}
