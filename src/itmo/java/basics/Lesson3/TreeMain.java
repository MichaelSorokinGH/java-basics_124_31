package itmo.java.basics.Lesson3;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree1 = new Tree(25, "Береза");
        Tree tree2 = new Tree(20, true, "Сосна");
        Tree tree3 = new Tree();
        System.out.println(tree1);
        System.out.println(tree2);
    }
}
