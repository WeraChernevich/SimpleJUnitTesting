package ru.app.VeraChernevich;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    static Dog dog;

//    @BeforeEach
//    void preparedData() {
//        dog = new Dog("Tom", 2);
//    }

    @BeforeAll
    static void preparedData() {
       dog = new Dog("Tom", 2);
    }

    @Test
    void testGetDogNameMethod() {
        assertEquals("Tom", dog.getName());
    }

    @Test
    void testSetDogNameMethod() {
        dog.setName("Mark");
        assertEquals("Tom", dog.getName());
    }

    @Test
    void testSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Mark");
        assertEquals("Mark", dog.getName());
    }

    @Test
    void testGetDogAgeMethod() {
    }

    @Test
    void testSetDogAgeMethod() {
    }
}