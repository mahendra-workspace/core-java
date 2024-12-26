package OOP;

public class Vehicle {
    protected String brand;
    protected int speed;
    protected double price;

    public Vehicle(String brand, int speed, double price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;

    }

    protected void displayInfo(){
        System.out.println("Brand: "+ brand+" \nSpeed: "+speed+"km/h"+" \nPrice: "+ price);
    }
}
