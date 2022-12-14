package itmo.java.basics.Lesson6;

public class Main {
    public static void main(String[] args) {
        BankEmployer bankEmployer1 = new BankEmployer("Michael", "Jackson", "Swedbank");
        Client client1 = new Client("Zlatan", "Ibrahimovic", "Nordbank");
        bankEmployer1.showAllInfo();
        client1.showAllInfo();
    }
}
