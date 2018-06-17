package Sweets;

public class Candy extends Sweets {
    private int CandyID;

    public Candy(String name, int weight, int price, int CandyID) {
        super(name, weight, price);
        this.CandyID = CandyID;
    }

    public String toString() {
        return "ID " + CandyID + ": " + super.toString();
    }
}
