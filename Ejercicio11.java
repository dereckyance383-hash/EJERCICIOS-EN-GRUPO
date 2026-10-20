import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el primer numero entero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Division: " + ((double) num1 / num2));
            System.out.println("Modulo: " + (num1 % num2));
        } else {
            System.out.println("No se puede dividir ni calcular modulo con divisor cero.");
        }
        sc.close();
    }
}
