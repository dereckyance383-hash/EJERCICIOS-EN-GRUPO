import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Ingrese el primer lado del rectangulo: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el segundo lado del rectangulo: ");
        b = sc.nextDouble();

        double perimetro = 2 * a + 2 * b;
        double area = a * b;

        System.out.println("Perimetro del rectangulo: " + perimetro);
        System.out.println("Area del rectangulo: " + area);
        sc.close();
    }
}
