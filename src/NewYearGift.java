import Sweets.*;

public class NewYearGift {
    public static void main(String[] args) {
        System.out.println("New Year gift consists of:");
        Candy candy = new Candy("Candy",130, 2, 1);
        Cookie cookie = new Cookie("Cookie", 150, 2, 2);
        Jellybean jellybean = new Jellybean("Jellybean", 300,3, 3);
        Marshmallow marshmallow = new Marshmallow("Marshmallow",250, 4,4);
        Chocolate chocolate = new Chocolate("Chocolate", 100, 7,5);
        Sweets[] gift = {candy, cookie, jellybean, marshmallow, chocolate};
        for (Sweets Parametr : gift) {
            System.out.println(Parametr.toString());
        }
        int price = candy.getPrice() + cookie.getPrice() + jellybean.getPrice() + marshmallow.getPrice() + chocolate.getPrice();
        System.out.println("Price of New Year gift = " + price+ " $");
        int weight = candy.getWeight() + cookie.getWeight() + jellybean.getWeight() + marshmallow.getWeight() + chocolate.getWeight();
        System.out.println("Weight of New Year gift = " + weight+ " g");

    }
}

