/*
Program to Handle Mobile Phone Details
Problem Statement:
The MobilePhone class uses attributes to store the phone's characteristics.
 The method is used to retrieve and display this information for each object.
*/
public class MobilePhone {
    //    Create a MobilePhone class with attributes brand, model, and price.
    private String brand;
    private String model;
    private int price;
    MobilePhone(String brand, String model , int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
//    Add a method to display all the details of the phone.
    private void display(){
        System.out.println("Mobile model is "+ this.model);
        System.out.println("Mobile brand is "+ this.brand);
        System.out.println("Mobile price is "+ this.price+ "\n");
    }
    public static void main(String[] args){
        MobilePhone ma = new MobilePhone("Oppo","RX4562",9000);
        MobilePhone mb = new MobilePhone("SAMSUNG","M2",15000);
        ma.display();
        mb.display();
    }

}
