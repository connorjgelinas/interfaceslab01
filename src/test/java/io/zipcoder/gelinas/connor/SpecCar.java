package io.zipcoder.gelinas.connor;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by connorjgelinas on 2/4/16.
 */

public class SpecCar {

    //Classes for testing
    Car testCar;
    ElectricAMG testAMG;
    M3 testM3;
    McLaren testMcLaren;
    Venom testVenom;
    Veyron testVeyron;

    @Before
    public void testObjects(){
        testCar = new Car();
        testAMG = new ElectricAMG("Mercedes SLS AMG Electric Power");
        testM3 = new M3("BMW F92 M3");
        testMcLaren = new McLaren("McLaren P1");
        testVenom = new Venom("Hennessey Venom GT");
        testVeyron = new Veyron("Bugatti Veyron SS");
    }

    //Turn On Tests
    @Test
    public void amgCanTurnOn() { assertTrue("AMG Should turn on ", testAMG.turnOn()); }

    @Test
    public void m3CanTurnOn() { assertTrue("M3 Should turn on ", testM3.turnOn()); }

    @Test
    public void mcLarenCanTurnOn() { assertTrue("McLaren Should turn on ", testMcLaren.turnOn()); }

    @Test
    public void venomCanTurnOn() { assertTrue("Venom Should turn on ", testVenom.turnOn()); }

    @Test
    public void veyronCanTurnOn() { assertTrue("Veyron Should turn on ", testVeyron.turnOn()); }

    //Turn Off Tests
    @Test
    public void amgCanTurnOff() { assertFalse("AMG Should turn on ", testAMG.turnOff()); }

    @Test
    public void m3CanTurnOff() { assertFalse("M3 Should turn on ", testM3.turnOff()); }

    @Test
    public void mcLarenCanTurnOff() { assertFalse("AMG Should turn on ", testMcLaren.turnOff()); }

    @Test
    public void venomCanTurnOff() { assertFalse("AMG Should turn on ", testVenom.turnOff()); }

    @Test
    public void veyronCanTurnOff() { assertFalse("AMG Should turn on ", testVeyron.turnOff()); }

    //Refuel Tests
    @Test
    public void amgCanRefuel() { assertNotNull("AMG refuel should return fuel", testAMG.refuel()); }

    @Test
    public void m3CanRefuel() { assertNotNull("M3 refuel should return fuel", testM3.refuel()); }

    @Test
    public void mcLarenCanRefuel() { assertNotNull("McLaren refuel should return fuel", testMcLaren.refuel()); }

    @Test
    public void venomCanRefuel() { assertNotNull("Venom refuel should return fuel", testVenom.refuel()); }

    @Test
    public void veyronCanRefuel() { assertNotNull("Veyron refuel should return fuel", testVeyron.refuel()); }

    //Test Fuel Types
    @Test
    public void amgHasFuelType() { assertEquals("AMG should be electric", FuelType.ELECTRIC, testAMG.fuelType); }

    @Test
    public void m3HasFuelType() { assertEquals("M# should be petrol", FuelType.PETROL, testM3.fuelType); }

    @Test
    public void mcLarenHasFuelType() { assertEquals("McLaren should be hybrid", FuelType.HYBRID, testMcLaren.fuelType); }

    @Test
    public void venomHasFuelType() { assertEquals("Venom should be petrol", FuelType.PETROL, testVenom.fuelType); }

    @Test
    public void veyronHasFuelType() { assertEquals("Veyron should be petrol", FuelType.PETROL, testVeyron.fuelType); }
}
