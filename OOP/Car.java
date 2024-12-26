package OOP;
public class Car extends Vehicle {
    private String model;

    public Car(String brand, int speed, double price, String model){
        super(brand, speed, price);
        this.model = model;

    }
    void showDetails(){
        displayInfo();
        System.out.println("Model: "+ model);
    }
  
}

