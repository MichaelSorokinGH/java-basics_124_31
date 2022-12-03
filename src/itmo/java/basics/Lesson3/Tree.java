package itmo.java.basics.Lesson3;

public class Tree {
    int age;
    Boolean alive;
    String title;

    public Tree(int age, String title) {
        this.age = age;
        this.title = title;
    }

    public Tree(int age, Boolean alive, String title) {
        this.age = age;
        this.alive = alive;
        this.title = title;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", alive=" + alive +
                ", title='" + title + '\'' +
                '}';
    }
}

