package org.example;

import org.example.oop.Car;
import org.example.oop.Driver;


/*
* Car ve Driverin objectini (instance-ni) yarat
* Car in start() methodunu cagir
* Driverin drive() methodunu cagir.
* Fso bilmirsen Menden (Ismayildan) sorush, ashkim!
 */
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Driver rasul = new Driver();

        bmw.start();
        rasul.drive();

    }


}