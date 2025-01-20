import java.util.ArrayList;

// Factory class to create different types of attractions
class TouristAttractionFactory {

    // Create historical sites
    public ArrayList<HistoricalSite> createHistoricalSites() {
        ArrayList<HistoricalSite> historicalSites = new ArrayList<>();
        historicalSites.add(new HistoricalSite("Tower of London", "A historic castle and former royal residence.", "Tower Hill, London"));
        historicalSites.add(new HistoricalSite("Buckingham Palace", "The official residence of the British monarch.", "Westminster, London"));
        historicalSites.add(new HistoricalSite("The British Museum", "A world-famous museum with a vast collection of art and artifacts.", "Great Russell St, London"));
        historicalSites.add(new HistoricalSite("Westminster Abbey", "A historic church where many British monarchs are crowned.", "Westminster, London"));
        historicalSites.add(new HistoricalSite("St. Paul's Cathedral", "A magnificent Anglican cathedral with a great dome.", "St. Paul's Churchyard, London"));
        return historicalSites;
    }

    // Create restaurants
    public ArrayList<Restaurant> createRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Dishoom", "A popular Indian restaurant offering a wide variety of dishes.", "Covent Garden, London"));
        restaurants.add(new Restaurant("Sketch", "A Michelin-starred restaurant known for its art-inspired decor.", "Conduit St, London"));
        restaurants.add(new Restaurant("The Ledbury", "An upscale restaurant offering British cuisine.", "Notting Hill, London"));
        restaurants.add(new Restaurant("Nopi", "A restaurant offering Mediterranean and Middle Eastern food.", "Soho, London"));
        restaurants.add(new Restaurant("Duck & Waffle", "A 24-hour restaurant offering British and European food with a stunning view.", "Heron Tower, London"));
        return restaurants;
    }

    // Create parks
    public ArrayList<Park> createParks() {
        ArrayList<Park> parks = new ArrayList<>();
        parks.add(new Park("Hyde Park", "One of London's largest and most famous parks.", "Westminster, London"));
        parks.add(new Park("Regent's Park", "A large park with gardens and open spaces.", "Camden, London"));
        parks.add(new Park("Kensington Gardens", "A large park with Kensington Palace and beautiful landscapes.", "Kensington, London"));
        parks.add(new Park("Greenwich Park", "A Royal Park with a great view of the River Thames.", "Greenwich, London"));
        parks.add(new Park("St. James's Park", "A park with a beautiful lake and views of Buckingham Palace.", "Westminster, London"));
        return parks;
    }

    // Create nightlife options
    public ArrayList<Nightlife> createNightlife() {
        ArrayList<Nightlife> nightlifes = new ArrayList<>();
        nightlifes.add(new Nightlife("Fabric", "A famous nightclub offering electronic music.", "Farringdon, London"));
        nightlifes.add(new Nightlife("The Alchemist", "A cocktail bar known for its molecular mixology.", "Liverpool Street, London"));
        nightlifes.add(new Nightlife("Ministry of Sound", "A world-renowned nightclub with great DJs.", "Southwark, London"));
        nightlifes.add(new Nightlife("Ronnie Scott's Jazz Club", "A legendary jazz club in the heart of Soho.", "Soho, London"));
        nightlifes.add(new Nightlife("Barbican Centre", "A cultural complex offering music, theater, and film.", "Barbican, London"));
        return nightlifes;
    }
}
