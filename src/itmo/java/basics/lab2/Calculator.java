package itmo.java.basics.lab2;

public class Calculator {
    public static void main(String[] args) {

        double a = 10;
        double b = 7;
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(a, b));
        System.out.println(calculator.subtract(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.div(a, b));
    }
    int add(int a, int b) {
        return (a + b); }

    double add(double a, double b) {
        return (a + b); }

    long add(long a, long b) {
        return (a + b); }

    int subtract(int a, int b) {
        return (a - b); }

    double subtract(double a, double b) {
        return (a - b); }

    long subtract(long a, long b) {
        return (a - b); }

    int multiply(int a, int b) {
        return (a * b); }

    double multiply(double a, double b) {
        return (a * b); }

    long multiply(long a, long b) {
        return (a * b); }

    double div(int a, int b) {
        return (a / b); }

    double div(double a, double b) {
        return (a / b); }

    double div(long a, long b) {
        return (a / b); }
}
