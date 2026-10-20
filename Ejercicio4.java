import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Ingrese la base del triangulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;
        System.out.println("Area del triangulo: " + area);
        sc.close();
    }
}
