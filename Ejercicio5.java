import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.print("Ingrese el primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese el segundo lado: ");
        lado2 = sc.nextDouble();
        System.out.print("Ingrese el tercer lado: ");
        lado3 = sc.nextDouble();

        System.out.println("Perimetro del triangulo: " + (lado1 + lado2 + lado3));
        sc.close();
    }
}
