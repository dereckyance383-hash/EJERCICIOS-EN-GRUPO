import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;

        System.out.print("Ingrese los grados Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("Grados Celsius: " + celsius);
        sc.close();
    }
}
