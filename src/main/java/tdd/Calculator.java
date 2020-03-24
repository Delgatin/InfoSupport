package tdd;

import java.util.ArrayList;

public class Calculator {

    public Calculator() {

    }

    public int add(String input) {
        int som = 0;

        if (input == null) {
            return 0;
        } else if (input.isEmpty()) {
            return 0;
        }

        if (input.length() == 1) {
            try {
                int i = Integer.parseInt(input);
                return som+i;
            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
        }

        ArrayList<String> stringList = new ArrayList<>();

        String regex = input.substring(0,1);

        input = input.replace("\n", regex);
        String[] alleNummersString = input.split(regex);


        int[] alleNummersInt = new int[alleNummersString.length];
        for (int i = 0; i < alleNummersString.length; i++) {
            try {
                if (alleNummersString[i].isEmpty()) {
                    continue;
                }
                alleNummersInt[i] = Integer.parseInt(alleNummersString[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
        }
        StringBuilder negativeNumbers = new StringBuilder();
        boolean containsNegativeNumber = false;
        for (int i : alleNummersInt) {
            if (i < 0) {
                negativeNumbers.append(" ").append(i);
                containsNegativeNumber = true;
            } else {
                som += i;
            }
        }

        if (containsNegativeNumber) {
            throw new RuntimeException("Negative numbers are not allowed. \n Contains numbers:" + negativeNumbers);
        }

        return som;
    }
}
