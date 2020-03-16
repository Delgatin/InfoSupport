package first.hw3;

public class HW3 {
    public HW3() {

    }

    public void differenceBetweenPlusOperatorBeforeAndAfter() {
        int i = 0;
        int j = 0;
        System.out.println("Waarde van i: " + i + ". Verhoging vind plaats na de variabele: " + verhoogGetal(i++));
        System.out.println("Waarde van j: " + j + ". Verhoging vind plaats na de variabele: " + verhoogGetal(++j));
    }

    public int verhoogGetal(int getal) { return getal; }

    public void explainTheValueOfJ() {
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println("Waarde van j: " + j);
    }

    public int telBinariesOp (byte een, byte twee) {
        System.out.println("Som van de bytes " + Integer.toBinaryString(een) + " en " + Integer.toBinaryString(twee)
        + " is: " + (een + twee) + " of in binary: " + Integer.toBinaryString(een + twee));
        return een + twee;
    }

    public int timeCalculation(int tijd, int extraTijd) {
        tijd = (tijd + extraTijd) % 24;
        System.out.println("De tijd is: " + tijd + ":00");
        return tijd;
    }

    public String clientName(String naam1, String naam2, String naam3) {
        Client c1 = new Client(naam1);
        Client c2 = new Client(naam2);
        c2 = c1;
        c2.setName(naam3);
        return c1.getName();
    }
}
