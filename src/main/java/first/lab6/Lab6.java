package first.lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {

    int[] array = new int[10];

    public Lab6() {

    }

    public void readTenNumbers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public int berekenTotaalWaardeArray(int[] array) {
        int som = 0;
        for (int i : array) {
            som += i;
        }
        return som;
    }

    public int[][] returnFilledArrayWithUniqueNumbers(int arraySize) {
        int[][] array2d = new int[arraySize][arraySize];
        boolean geenGetalGeplaatst = true;
        boolean geenDubbelNummer = true;
        arraySize *= arraySize;
        Random r = new Random();
        for (int i = 0; i < arraySize; i++) { // Loop voor het aantal getallen dat geplaatst moet worden
            while (geenGetalGeplaatst) {
                geenDubbelNummer = true;
                int randomGetal = r.nextInt(arraySize + 1);
                for (int j = 0; j < array2d.length; j++) { //Loop om over 1ste as van de array te loopen
                    if (geenGetalGeplaatst) {
                        if (geenDubbelNummer) {
                            for (int k = 0; k < array2d.length; k++) { //loop om over de 2de as van de array te loopen
                                if (array2d[j][k] == randomGetal) {
                                    randomGetal = r.nextInt(arraySize + 1);
                                    geenDubbelNummer = false;
                                    break;
                                } else {
                                    if (array2d[j][k] == 0) {
                                        array2d[j][k] = randomGetal;
                                        geenGetalGeplaatst = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            geenGetalGeplaatst = true;
        }
        return array2d;
    }

    public int[][] returnFilledArrayWithUniqueNumbers2(int arraySize) {
        int[][] array2d = new int[arraySize][arraySize];
        Random r = new Random();
        arraySize *= arraySize;
        int[] waardeDieIngevuldWordt = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            waardeDieIngevuldWordt[i] = i+1;
        }

        int counter = 0;
        int getal1;
        int getal2;
        while (counter < arraySize) {
            getal1 = r.nextInt(array2d.length);
            getal2 = r.nextInt(array2d.length);
            if (array2d[getal1][getal2] == 0) {
                array2d[getal1][getal2] = waardeDieIngevuldWordt[counter];
                counter++;
            }
        }

        return array2d;
    }
}
