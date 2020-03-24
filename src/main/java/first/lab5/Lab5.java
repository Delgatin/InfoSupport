package first.lab5;

public class Lab5 {
    public Lab5() {

    }

    public String returnGreatest (String message1, String message2) {
        if (message1.length() >= message2.length()) {
            return message1;
        } else {
            return message2;
        }
    }

    public int returnGreatest (int number1, int number2) {
        return Math.max(number1, number2);
    }

    public int factorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
