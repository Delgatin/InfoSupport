package first.hw6;

public class HW6 {


    public void rowTest() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;

        /*
        * De verwachte waarde voor row[2] is 4.
        * Dit omdat de ophoging van copy[2] refereerd naar dezelfde waarde als row[2].
        * ************************************
        * De waarde van row[4] is 0;
        */
        System.out.println(row[2]);
    }

    public long[] increaseArraySize(long[] array) {
        long[] newArray = new long[(array.length * 2)];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public long[] multipleEveryValue(long[] array, int multiplier) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= multiplier;
        }
        return array;
    }




}
