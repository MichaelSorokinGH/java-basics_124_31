package itmo.java.basics.lab6;

public class ExtendedAge extends MainAge {
    String name;
    public void Info() {
        System.out.println("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.println("Имя пользователя: " + name);
    }
}
