/*
Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights.
Use default, parameterized, and copy constructors to initialize bookings.
*/
public class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;
    HotelBooking(){
        // because if we initialise param. cons. default will not be invoked
    }
    HotelBooking(String guestName , String roomType , int nights){
        this.guestName = guestName;
        this.roomType= roomType;
        this.nights = nights;
        System.out.println(guestName);
    }
    HotelBooking(HotelBooking p){
        this.guestName = p.guestName;
        this.roomType= p.roomType;
        this.nights = p.nights;
        System.out.println(guestName);
    }
    public static void main(String[] args){
        HotelBooking pn = new HotelBooking("Saurabh" , "AC" , 2);
        HotelBooking pn2 = new HotelBooking(pn);
        
    }
}