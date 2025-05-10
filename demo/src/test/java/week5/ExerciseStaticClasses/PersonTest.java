package week5.ExerciseStaticClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testFullNameWithMiddleNameAndSuffix() {
        Person p = new Person("Mel", "B", "Johnson", "PHD");
        assertEquals("Mel B Johnson, PHD", p.frisNameName());
    }

    @Test
    public void testFullNameWithoutMiddleName() {
        Person p = new Person("Mel", "", "Johnson", "PHD");
        assertEquals("Mel  Johnson, PHD", p.frisNameName());
    }

    @Test
    public void testFullNameWithoutSuffix() {
        Person p = new Person("Mel", "B", "Johnson", "");
        assertEquals("Mel B Johnson", p.frisNameName());
    }

    @Test
    public void testFullNameWithoutMiddleNameAndSuffix() {
        Person p = new Person("Mel", "", "Johnson", "");
        assertEquals("Mel  Johnson", p.frisNameName());
    }

    @Test
    public void testFullNameWithNullValues() {
        Person p = new Person("Mel", null, "Johnson", null);
        assertEquals("Mel null Johnson", p.frisNameName()); // current logic prints "null"
    }
}
