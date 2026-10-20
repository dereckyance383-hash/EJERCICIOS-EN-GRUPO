import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;

        System.out.print("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();

        double area = Math.PI * radio * radio;
        System.out.println("Area del circulo: " + area);
        sc.close();
    }
}
