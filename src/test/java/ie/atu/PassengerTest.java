package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    Passenger passenger;


    @BeforeEach
    void setUp() {
        passenger = new Passenger(23,"12345678910","Mr", "Cian", "08723456");

    }

    @Test
    void testInsertedAgeFail(){

        Exception exMessage3 =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"123456789100","Mr", "Cian", "087234567");});
        assertEquals("This is not a valid age", exMessage3.getMessage());
    }

    @Test
    void testInsertedAgeSuccess(){
        assertEquals(23, passenger.getAge());
    }

    @Test
    void testInsertedIdFail(){

        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(23,"123456","Mr", "Cian", "087234567");});
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }
    @Test
    void testIdSuccess(){
        assertEquals("12345678910", passenger.getId());
    }

    @Test
    void testInsertedTitleFail(){

        Exception exMessage1 =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"12345678910","Miss", "Cian", "087234567");});
        assertEquals("This is not a valid age", exMessage1.getMessage());
    }
    @Test
    void testTitleSuccess(){
        assertEquals("Mr", passenger.getTitle());
    }

    @Test
    void testTitleSuccessMrs(){
        passenger.setTitle("Mrs");
        assertEquals("Mrs", passenger.getTitle());
    }

    @Test
    void testTitleSuccessMs(){
        passenger.setTitle("Ms");
        assertEquals("Ms", passenger.getTitle());
    }

    @Test
    void testInsertedNameFail(){

        Exception exMessage2 =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"123456789100","Mr", "Ci", "087234567");});
        assertEquals("This is not a valid age", exMessage2.getMessage());
    }
    @Test
    void testNameSuccess(){
        assertEquals("Cian", passenger.getName());
    }

    @Test
    void testInsertedNumberFail(){

        Exception exMessage4 =  assertThrows(IllegalArgumentException.class, () -> { new Passenger(5,"123456789100","Mr", "Cian", "087");});
        assertEquals("This is not a valid age", exMessage4.getMessage());
    }
    @Test
    void testNumberSuccess(){
        assertEquals("08723456", passenger.getPhoneNumber());
    }

    @AfterEach
    void tearDown() {
    }
}