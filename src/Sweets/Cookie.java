package Sweets;

public class Cookie extends Sweets {
    private int CookieID;
    public Cookie(String name, int weight, int price, int CookieID) {
        super(name, weight, price);
        this.CookieID = CookieID;
    }
    public String toString() {
        return "ID " + CookieID + ": " + super.toString();
    }
}

