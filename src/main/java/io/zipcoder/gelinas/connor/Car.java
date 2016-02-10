package io.zipcoder.gelinas.connor;

/**
 * Created by connorjgelinas on 2/4/16.
 */
public class Car implements Driveable {
    public String name;
    public int fuelLevel = 0;
    public boolean isOn = false;
    public int distanceDriven = 0;
    public Enum fuelType;

    public void drive() { //Will drive a car as long as it is on and has fuel. Tells user what car and how far
        while(fuelLevel > 0  && isOn) {
            distanceDriven++;
            System.out.println(name + " has driven " + distanceDriven + " meters");
        }
    }

    public boolean turnOn() { isOn = true; return isOn; }  //Turns a car on

    public boolean turnOff() { isOn = false; return isOn; }  //Turns a car off

    public int refuel() {
        return 100;
    }  //Refuels a car to maximum fuel capacity

    public void setName(String s) {
        name = s;
    }  //Allows a car's name to be changed on the fly if a user wants to

    public String getName() { return name; }  //Retrieves a cars name
}

class Veyron extends Car {
    public Veyron(String n) {
        this.fuelType = FuelType.PETROL;
    }
}

class Venom extends Car {
    public Venom(String n) {
        this.fuelType = FuelType.PETROL;
    }
}

class ElectricAMG extends Car {
    public ElectricAMG(String n) {
        this.fuelType = FuelType.ELECTRIC;
    }
}

class McLaren extends Car {
    public McLaren(String n) {
        this.fuelType = FuelType.HYBRID;
    }
}

class M3 extends Car {
    public M3(String n) {
        this.fuelType = FuelType.PETROL;
    }
}