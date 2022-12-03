package itmo.java.basics.lab3;

public class HomeMain {
    public static void main(String[] args) {
        Home home = new Home(24, 2019, "Жемчужина плаза");
        System.out.println(home);
        System.out.println(home.GetAge() + " years");
    }
}
