package itmo.java.basics.lab5;

public class lab2 {
    public static void main(String[] args) {
        String text = "Я иду, с мечем судия";
        System.out.println(isPalindrome(text));
    }
    static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s", "");
        text = text.replaceAll("\\p{Punct}", "");
        StringBuilder rev = new StringBuilder(text).reverse();
        String strRev = rev.toString();
        if (text.equalsIgnoreCase(strRev)) {
            return true;
        } else {
            return false;
        }
    }
}
