package itmo.java.basics.Lesson6;

public class Client extends Human {

    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public void showAllInfo() {
        System.out.println(name + " " + surname + " клиент " + bankName + " банка.");
    }
}
