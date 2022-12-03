package itmo.java.basics.Lesson2;

public enum Color {
    BLACK("Чёрный"),
    WHITE("Белый"),
    GOLD("Золотой"),
    ROSEGOLD("Розовое золото"),
    GRAY("Серый");

    private final String discription;

    Color(String discription) { this.discription = discription; }
}
