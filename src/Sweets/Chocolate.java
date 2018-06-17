package Sweets;

public class Chocolate extends Sweets {
    private int ChocolateID;
    public Chocolate(String name, int weight, int price, int ChocolateID) {
        super(name, weight, price);
        this.ChocolateID = ChocolateID;
    }
    public String toString() {
        return "ID " + ChocolateID + ": " + super.toString();
    }
}
