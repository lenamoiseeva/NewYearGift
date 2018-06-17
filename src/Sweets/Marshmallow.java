package Sweets;

public class Marshmallow extends Sweets {
    private int MarshmallowID;
    public Marshmallow(String name, int weight, int price, int MarshmallowID) {
        super(name, weight, price);
        this.MarshmallowID = MarshmallowID;
    }
    public String toString() {
        return "ID " + MarshmallowID + ": " + super.toString();
    }
}
