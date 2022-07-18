import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        //co się wpisze w skanerze, druknie się jako string ze zmiennej
        System.out.println(age);
        if (age % 2 == 0) {
            System.out.println("jest to liczba parzysta");
        } else {
            System.out.println("nieparzysta");
        }
    }
    }