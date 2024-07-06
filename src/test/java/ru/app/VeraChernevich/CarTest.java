package ru.app.VeraChernevich;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "abc1234", 2019, "Vera");
    }

    @Test
    void testGetManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void testGetNumber() {
        assertEquals("abc1234", car.getNumber());
    }

    @Test
    void testSetNumber() {
        car.setNumber("cba1234");
        assertEquals("cba1234", car.getNumber());
    }

    @Test
    void testGetYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void testGetOwner() {
        assertEquals("Vera", car.getOwner());
    }

    @Test
    void testSetOwner() {
        car.setOwner("Oleg");
        assertEquals("Oleg", car.getOwner());
    }

    @Test
    void testListGetOwners() {
        assertArrayEquals(new String[]{"Vera"}, car.getOwners().toArray());
    }

    @Test
    void testListOfGetOwners() {
        car.setOwner("Oleg");
        assertArrayEquals(new String[]{"Vera", "Oleg"}, car.getOwners().toArray());
    }
}