package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    Passenger age, id, title, name, phoneNumber;


    @BeforeEach
    void setUp() {
      age = new Passenger();
      id = new Passenger();
      title = new Passenger();
      name = new Passenger();
      phoneNumber = new Passenger();
    }

    @Test
    void testInsertedAgeFail(){
        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { age.getAge(5);});
        assertEquals("This is not a valid age", exMessage.getMessage());
    }

    @Test
    void testInsertedAgeSuccess(){
        assertEquals(23, age.getAge(23));
    }

    @Test
    void testInsertedIdFail(){
        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { id.getId("g05");});
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }
    @Test
    void testIdSuccess(){
        assertEquals("12345678910", id.getId("12345678910"));
    }

    @Test
    void testInsertedTitleFail(){
        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { title.getTitle("Miss");});
        assertEquals("This is not a valid title", exMessage.getMessage());
    }
    @Test
    void testTitleSuccessMr(){
        assertEquals("Mr", title.getTitle("Mr"));
    }

    @Test
    void testTitleSuccessMrs(){
        assertEquals("Mrs", title.getTitle("Mrs"));
    }

    @Test
    void testTitleSuccessMs(){
        assertEquals("Ms", title.getTitle("Ms"));
    }

    @Test
    void testInsertedNameFail(){
        Exception exMessage =  assertThrows(IllegalArgumentException.class, () -> { name.getName("ian");});
        assertEquals("This is not a valid name", exMessage.getMessage());
    }
    @Test
    void testNameSuccess(){
        assertEquals("Cian", name.getName("Cian"));
    }

    @Test
    void testInsertedNumberFail(){
        Exception exMessage4 =  assertThrows(IllegalArgumentException.class, () -> { phoneNumber.getPhoneNumber("0987");});
        assertEquals("This is not a valid number", exMessage4.getMessage());
    }
    @Test
    void testNumberSuccess(){
        assertEquals("08723456", phoneNumber.getPhoneNumber("08723456"));
    }

    @AfterEach
    void tearDown() {
    }
}