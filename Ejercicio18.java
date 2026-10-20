import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado;

        System.out.print("Ingrese el lado del cuadrado: ");
        lado = sc.nextDouble();

        double perimetro = 4 * lado;
        double area = lado * lado;

        System.out.println("Perimetro del cuadrado: " + perimetro);
        System.out.println("Area del cuadrado: " + area);
        sc.close();
    }
}
