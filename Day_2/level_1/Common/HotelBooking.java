public class HotelBooking {
    // Attributes of the HotelBooking class
    private String guestName;
    private String roomType; // E.g., Single, Double, Suite
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights > 0 ? nights : 1; // Ensure nights is at least 1
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getter and Setter for guestName
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Getter and Setter for roomType
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter and Setter for nights
    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        if (nights > 0) { // Ensure nights is non-negative
            this.nights = nights;
        }
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method to test the HotelBooking class
    public static void main(String[] args) {
        // Using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking Details:");
        defaultBooking.displayBookingDetails();

        // Using the parameterized constructor
        HotelBooking parameterizedBooking = new HotelBooking("Alice Johnson", "Suite", 3);
        System.out.println("\nParameterized Booking Details:");
        parameterizedBooking.displayBookingDetails();

        // Using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(parameterizedBooking);
        System.out.println("\nCopied Booking Details:");
        copiedBooking.displayBookingDetails();

        // Modifying the copied booking details
        copiedBooking.setGuestName("Bob Smith");
        copiedBooking.setRoomType("Double");
        copiedBooking.setNights(2);
        System.out.println("\nModified Copied Booking Details:");
        copiedBooking.displayBookingDetails();
    }
}
