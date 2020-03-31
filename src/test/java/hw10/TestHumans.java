package hw10;

import first.hw10.Android;
import first.hw10.Employee;
import first.hw10.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHumans {

    @Test
    void testPersonRepsonse() {
        Person p = new Person("Kees", 20);
        String response = p.greet();
        Assertions.assertEquals(response, "Hello, my name is Kees. Nice to meet you!");
    }

    @Test
    void testAndroidBadSetCharge() {
        Android a = new Android();
        Assertions.assertThrows(RuntimeException.class, () -> a.setCharge(101));
    }

    @Test
    void testAndroidGoodSetCharge() {
        Android a = new Android();
        a.setCharge(20);
    }

    @Test
    void testAndroidBadChargeWithGoodSetCharge() {
        Android a = new Android();
        a.setCharge(20);
        Assertions.assertThrows(RuntimeException.class, () -> a.charge(100));
    }

    @Test
    void testAndroidGoodCharge() {
        Android a = new Android();
        a.setCharge(30);
        Assertions.assertEquals(53, a.charge(23));
    }

    @Test
    void testMessageAndroid() {
        Android a = new Android();
        a.charge(15);
        Assertions.assertEquals(a.greet(), "I'm only half human, but human still... My energy level is 15%.");
    }

    @Test
    void testMessageEmployee() {
        Employee e = new Employee("Nino", 26);
        Assertions.assertEquals(e.greet(), "I'm tired of working. This is inhuman!");
    }
}
