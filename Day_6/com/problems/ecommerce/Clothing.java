package com.problems.ecommerce;

public class Clothing extends Product implements Taxable{

    public double Ctax;
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    double discount;
    double tax;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getProductId() {
        return this.productId ;
    }
    public String getName() {
        return this.name ;
    }
    public void setProductId(int ProductId) {
        this.productId = ProductId;
    }
    public void setName(String name) {
        this.name = name;
    }

    double price;

    Clothing(String name ,int productId , double price , double tax , double discount){
        setPrice(price);
        setTax(tax);
        setDiscount(discount);
        setName(name);
        setProductId(productId);
    }
    public void calculateTax(){
        Ctax = (this.price + this.tax - this.discount);
    }
    public double getTaxDetails(){
        return Ctax;
    }
    double calculateDiscount(){
        return (this.price + this.tax - this.discount);
    }
}
