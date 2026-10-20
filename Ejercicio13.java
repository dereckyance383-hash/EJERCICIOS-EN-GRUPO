import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double centimetros;

        System.out.print("Ingrese la medida en centimetros: ");
        centimetros = sc.nextDouble();

        System.out.println("Medida en pulgadas: " + (centimetros / 2.54));
        sc.close();
    }
}
