package itmo.java.basics.Lesson6;

abstract public class Human {
    String name, surname;

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public abstract void showAllInfo();
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

