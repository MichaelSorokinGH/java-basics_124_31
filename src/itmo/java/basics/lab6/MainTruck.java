package itmo.java.basics.lab6;

public class MainTruck {
    public static void main(String[] args) {
        Truck truck1 = new Truck(35, "Scania", 'c', 200, 8, 40);
        truck1.outPut();
        truck1.newWheels();
    }
}
