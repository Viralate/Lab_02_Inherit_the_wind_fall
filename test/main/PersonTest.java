package test.main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonConstructor() {
        Person person = new Person("John", "Doe", "001", "Mr.", 1980);
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("001", person.getID());
        assertEquals("Mr.", person.getTitle());
        assertEquals(1980, person.getYOB());
    }
}
