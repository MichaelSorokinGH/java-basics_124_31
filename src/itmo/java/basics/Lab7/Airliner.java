package itmo.java.basics.Lab7;

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
        Airliner.linerWing boing777 = new Airliner.linerWing(5000);
        Airliner.linerWing boing747 = new Airliner.linerWing(4000);
        boing777.infoWings();
        boing747.infoWings();
    }
}


