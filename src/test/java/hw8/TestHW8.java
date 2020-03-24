package hw8;

import first.hw7.Gender;
import first.hw7.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHW8 {

    Person p;

    @BeforeEach
    void beforeAll() {
        p = new Person("Jan", 45);
        p.setGender(Gender.MALE);
    }

    @Test
    public void TestToString() {
        Assertions.assertEquals("Jan 45 is MALE", p.toString());
    }

    @Test
    public void TestEquals() {
        Person p2 = new Person("Jan", 45);
        p2.setGender(Gender.MALE);
        Assertions.assertEquals(true, p.equals(p2));
    }

    @Test
    public void TestHash() {
        System.out.println(p.hashCode());
    }

    @Test
    public void TestFinalizer() throws InterruptedException {
        int counter = 0;
        Person p = new Person("Jan", 30);
        p = null;
        while (p == null) {
            Thread.sleep(100);
            if (counter == 5) {
                System.gc();
            }
            counter++;
        }
    }
}
