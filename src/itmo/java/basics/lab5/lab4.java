package itmo.java.basics.lab5;

public class lab4 {
    public static void main(String[] args) {
        String text = "Весёлый молочник";
        String symbol = "о";
        System.out.println((text + "о").split(symbol).length - 1);
    }
}
