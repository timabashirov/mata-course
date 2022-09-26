package org.example.oop;

public class Car {
    private String model;
    private String price;

    public  void start(){
        System.out.println("Starting the car more easier than stopping");

    }
    public void stop(){
        System.out.println("Very fast stop");

    }
    public void move(){
        System.out.println("Smooth stopping breaks");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
