package first.hw10;

public class Android extends Human implements Chargeable {

    private int charge;

    public String greet() {
        return "I'm only half human, but human still... My energy level is " + charge + "%.";
    }

    public void setCharge(int chargeAmount) {
        if (chargeAmount > 100) {
            throw new RuntimeException("Charge amount to high. Can only go to a 100.");
        } else {
            charge = chargeAmount;
        }
    }

    @Override
    public int charge(int amount) {

        int temp = charge;
        if ((temp += amount) > 100) {
            throw new RuntimeException("Charge amount to high. Can only go to a 100.");// TODO BRAM too ipv to; evt. nog charge en amount in message toevoegen?
        } else {
            charge += amount;
        }
        return charge;

        // TODO BRAM dit kan korter:
        // if (charge + amount <= 100) {
        //     return charge + amount;
        // } else {
        //     throw new RuntimeException("Charge amount to high. Can only go to a 100.");
        // }

    }
}
