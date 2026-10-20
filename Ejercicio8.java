import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double millasMarinas;

        System.out.print("Ingrese las millas marinas: ");
        millasMarinas = sc.nextDouble();

        System.out.println("Distancia en metros: " + (millasMarinas * 1852));
        sc.close();
    }
}
