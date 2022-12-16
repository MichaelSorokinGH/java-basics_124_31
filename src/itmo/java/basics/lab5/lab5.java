package itmo.java.basics.lab5;

public class lab5 {
    public static void main(String[] args) {
        String text = "sihT si a tset gnirts";
        reverse(text);
    }
    public static void reverse(String text) {
        System.out.println("Строка до инверсии: " + text);
        String[] s = text.split(" ");
        for (int i = 0; i < s.length; i++) {
            s[i] = new StringBuilder(s[i]).reverse().toString();
        }
        System.out.println("Строка после инверсии: ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(" " + s[i]);
        }
    }
}
