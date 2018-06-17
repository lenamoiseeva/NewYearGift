package Sweets;

public abstract class Sweets {
    private String name;
    private int weight;
    private int price;
    public Sweets(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }
    public int getPrice() {
        return price;
    }
    public String toString() {
        return "Name = " +name + "; Weight = " +weight+ "; Price = " +price;
    }
}

