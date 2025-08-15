public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        Calculator<Double> doubleCalc = new Calculator<>();

        System.out.println("Integer operations:");
        System.out.println("5 + 3 = " + intCalc.add(5, 3));
        System.out.println("5 - 3 = " + intCalc.subtract(5, 3));
        System.out.println("5 * 3 = " + intCalc.multiply(5, 3));
        System.out.println("5 / 3 = " + intCalc.divide(5, 3));

        System.out.println("\nDouble operations:");
        System.out.println("5.5 + 3.2 = " + doubleCalc.add(5.5, 3.2));
        System.out.println("5.5 - 3.2 = " + doubleCalc.subtract(5.5, 3.2));
        System.out.println("5.5 * 3.2 = " + doubleCalc.multiply(5.5, 3.2));
        System.out.println("5.5 / 3.2 = " + doubleCalc.divide(5.5, 3.2));
    }
}