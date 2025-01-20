// Historical Site class, a specific type of Attraction
class HistoricalSite extends Attraction {

    // Constructor to initialise a HistoricalSite
    public HistoricalSite(String name, String description, String location) {
        super(name, description, location); // Call parent class constructor
    }

    // Implement the abstract displayInfo method to show details of the historical site
    @Override
    public void displayInfo() {
        System.out.println("Historical Site: " + name);
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
