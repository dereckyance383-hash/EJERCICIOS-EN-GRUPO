import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.print("Ingrese la nota del primer corte (0.0 a 5.0): ");
        nota1 = sc.nextDouble();
        System.out.print("Ingrese la nota del segundo corte (0.0 a 5.0): ");
        nota2 = sc.nextDouble();

        nota3 = (3.0 - nota1 * 0.20 - nota2 * 0.20) / 0.60;

        if (nota3 <= 0) {
            System.out.println("Con las notas actuales ya alcanza el minimo de 3.0, incluso con 0 en el tercer corte.");
        } else if (nota3 <= 5.0) {
            System.out.printf("Nota minima necesaria en el tercer corte: %.2f%n", nota3);
        } else {
            System.out.println("No es posible aprobar: necesitarias mas de 5.0 en el tercer corte.");
        }
        sc.close();
    }
}
