package itmo.java.basics.lab6;

public class BankEmployer extends Human {
    String bankName;

    public BankEmployer(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    public void showAllInfo() {
        System.out.println(name + " " + surname + " сотрудник " + bankName + " банка.");
    }
}
