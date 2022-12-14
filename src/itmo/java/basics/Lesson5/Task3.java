package itmo.java.basics.Lesson5;

public class Task3 {
    public static void main(String[] args) {
        String text = "Это означает, что эта бяка очень переменчива.";
        censored(text);
    }
    public static void censored (String text) {
        text = text.replace("бяка", "[вырезано цензурой]");
        System.out.println(text);
    }
}
