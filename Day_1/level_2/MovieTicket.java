import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.
 */
public class MovieTicket {
    private HashMap<String, String> hm; // HashMap to store seat information
    private String movieName;
    private double price;
    MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.hm = new HashMap<>(); // Initialize the HashMap
        // Initialize seats
        for (int i = 1; i <= 10; i++) {
            hm.put("A" + i, "Available"); // Default seat status is "Available"
        }
    }

    // Book a ticket (assign seat and update price)
    public boolean bookTicket(String seatNumber, String userName) {
        // Check if the seat exists and is available
        if (hm.containsKey(seatNumber) && hm.get(seatNumber).equals("Available")) {
            // Book the seat
            hm.put(seatNumber, userName);
            System.out.println("Seat " + seatNumber + " successfully booked for " + userName + "!");
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is already booked or does not exist.");
            return false;
        }
    }

    // Display the seat plan
    public void displaySeatPlan() {
        System.out.println("Seat Plan for Movie: " + movieName);
        Iterator<Map.Entry<String, String>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Seat " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket("Kali", 150);
        mt.bookTicket("A1", "Saurabh");
        mt.bookTicket("A2", "Rahul");
        mt.bookTicket("A1", "Ankit");
        mt.displaySeatPlan();
    }
}
