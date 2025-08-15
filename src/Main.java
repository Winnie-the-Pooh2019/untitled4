import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name);
    }

    public static void printName(String name) {
        if (name != null) {
            System.out.println("Hello, " + name);
        }
    }
}

class Person {
    public String name;
    public int age;
}