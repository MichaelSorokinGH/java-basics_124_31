package itmo.java.basics.Lesson2;

public class AdditionalPurchase {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("IPhone", "Xs", 256, Color.ROSEGOLD);
        smartphone.setPrice(45000L);
        System.out.println(totalPrice(smartphone, 5000));
    }

    public static Long totalPrice(Smartphone smartphone, Integer additionalPurchasePrice) {
        if (additionalPurchasePrice == null) {
            System.err.println("PurchasePrice is null");
            return smartphone.getPrice();
        } else {
            return smartphone.getPrice() + additionalPurchasePrice;
        }
    }
}
