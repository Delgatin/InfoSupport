package hw7;

import first.hw7.Gender;
import first.hw7.Person;
import org.junit.jupiter.api.Test;

public class TestHW7 {

    @Test
    void testPerson() {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday();
        System.out.println(p.getLeeftijd());
        System.out.println(Person.numberOfPossibleGenders);
    }
}
