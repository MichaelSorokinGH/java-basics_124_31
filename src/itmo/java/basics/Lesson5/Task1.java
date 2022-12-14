package itmo.java.basics.Lesson5;

public class Task1 {
    public static void main(String[] args) {
        String str = "Соединённые штаты Америки";
        LongWord(str);
    }

    public static void LongWord(String str) {

        String[] word = str.split(" ");
        int maxLong = word[0].length();
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > maxLong) {
                maxLong = word[i].length();
                index = i;
            }
        }
        System.out.println("Самое длинное слово: " + word[index]);
    }
}






