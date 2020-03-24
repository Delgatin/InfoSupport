package first.lab4;

import java.util.Scanner;

public class Lab4 {

    public Lab4() {
        Scanner scanner = new Scanner(System.in);
        String rekening = scanner.next();
        int[] rekeningNummers = rekeningNummers(rekening);

        if (elevenProof(rekeningNummers)) {
            System.out.println("Dit nummer " + rekening + " kan wel een geldig rekeningnummer zijn.");
        } else {
            throw new IllegalArgumentException("Dit nummer " + rekening + " kan geen een geldig rekeningnummer zijn.");
        }
    }

    private int[] rekeningNummers(String rekening) {
        int[] temp = new int[rekening.length()];
        for (int i = 0; i < rekening.length(); i++) {
            temp[i] = Integer.parseInt(rekening.substring(i, i+1));
        }
        return temp;
    }

    public boolean elevenProof(int[] rekening) {
        int totaalSom = 0;
        int counter = 0;
        if (rekening.length == 9) {
            for (int i = rekening.length; i > 0; i--) {
                totaalSom = totaalSom + i * rekening[counter];
                counter++;
            }
            return totaalSom % 11 == 0;
        } else if (rekening.length == 10) {
            for (int i = rekening.length; i > 0; i--) {
                totaalSom = totaalSom + rekening[rekening.length-1-counter] * i;
                counter++;
            }
            return totaalSom % 11 == 0;
        } else {
            return false;
        }
    }
}
