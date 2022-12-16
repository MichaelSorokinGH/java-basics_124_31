package itmo.java.basics.Lesson7;

public class Airliner {
    public static class linerWing {
        int weight;

        public linerWing(int weight) {
            this.weight = weight;
        }

        public void infoWings() {
            System.out.println("Вес крыла составляет: " + weight + "кг.");
        }
    }

    public static void main(String[] args) {
        linerWing boing777 = new linerWing(5000);
        linerWing boing747 = new linerWing(4000);
        boing777.infoWings();
        boing747.infoWings();
    }

}
