package Sweets;

public class Jellybean extends Sweets {
    private int JellybeanID;
    public Jellybean(String name, int weight, int price, int JellybeanID) {
        super(name, weight, price);
        this.JellybeanID = JellybeanID;
    }
    public String toString() {
        return "ID " + JellybeanID + ": " + super.toString();
    }
}
