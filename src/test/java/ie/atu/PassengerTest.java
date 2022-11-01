package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    Passenger passenger;


    @BeforeEach
    void setUp() {
        passenger = new Passenger(23,"1234567891","Mr", "Cian", "08723456");

    }

    @Test
    void testInsertedAge(){

        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"12345678910","Mr", "Cian", "087234567");});
        assertEquals("This is not a valid age", exMessage.getMessage());
    }

    @Test
    void testInsertedAgeSuccess(){
        assertEquals(18, passenger.getAge());
    }

    @Test
    void testInsertedId(){

        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(23,"123456","Mr", "Cian", "087234567");});
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }
    @Test
    void testIdSuccess(){
        assertEquals("1808080808", passenger.getId());
    }

    @Test
    void testInsertedTitle(){

        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"12345678910","Miss", "Cian", "087234567");});
        assertEquals("This is not a valid title", exMessage.getMessage());
    }
    @Test
    void testTitleSuccess(){
        assertEquals("Mr", passenger.getTitle());
    }

    @Test
    void testInsertedName(){

        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"12345678910","Mr", "Ci", "087234567");});
        assertEquals("This is not a valid name", exMessage.getMessage());
    }
    @Test
    void testNameSuccess(){
        assertEquals("Cian", passenger.getName());
    }

    @Test
    void testInsertedNumber(){

        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"12345678910","Mr", "Cian", "087");});
        assertEquals("This is not a valid number", exMessage.getMessage());
    }
    @Test
    void testNumberSuccess(){
        assertEquals("0871234567", passenger.getPhoneNumber());
    }

    @AfterEach
    void tearDown() {
    }
}