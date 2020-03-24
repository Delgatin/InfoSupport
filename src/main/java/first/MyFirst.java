package first;

import first.hw3.HW3;
import first.hw4.EvenNumberException;
import first.hw4.HW4;
import first.hw6.HW6;
import first.lab4.Lab4;
import first.lab6.Lab6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyFirst {
    public static void main(String[] args) throws EvenNumberException {
        lab6();
    }

    private static void opdrachtHW3() {
        HW3 hw3 = new HW3();
        hw3.differenceBetweenPlusOperatorBeforeAndAfter();
        hw3.explainTheValueOfJ();
        hw3.telBinariesOp((byte)0b1010, (byte)0b0100);
        hw3.timeCalculation(24, 5);
        hw3.clientName("Piet", "Jan", "Joris");
    }

    private static void opdrachtHW4() throws EvenNumberException {
        HW4 hw4 = new HW4();
        hw4.season("spring");
        hw4.printHourGlass(13);
    }

    private static void lab4() {
        Lab4 lab4 = new Lab4();

    }

    private static void hw6() {
        HW6 hw6 = new HW6();
        hw6.rowTest();
        long[] array = {1L, 2L, 3L, 4L};
        System.out.println(Arrays.toString(hw6.increaseArraySize(array)));
        System.out.println(Arrays.toString(hw6.multipleEveryValue(array, 2)));
    }

    private static void lab6() {
        Lab6 lab6 = new Lab6();
        int[][] array = lab6.returnFilledArrayWithUniqueNumbers(3);
        int[][] array2 = lab6.returnFilledArrayWithUniqueNumbers2(3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
    }
}
