package first;

import first.hw3.HW3;
import first.hw4.HW4;

public class MyFirst {
    public static void main(String[] args) {

    }

    private static void opdrachtHW3() {
        HW3 hw3 = new HW3();
        hw3.differenceBetweenPlusOperatorBeforeAndAfter();
        hw3.explainTheValueOfJ();
        hw3.telBinariesOp((byte)0b1010, (byte)0b0100);
        hw3.timeCalculation(24, 5);
        hw3.clientName("Piet", "Jan", "Joris");
    }

    private static void opdrachtHW4() {
        HW4 hw4 = new HW4();
        hw4.season("spring");
    }
}
