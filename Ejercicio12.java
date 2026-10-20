import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = sc.nextInt();

        System.out.println("Ultima cifra: " + Math.abs(numero % 10));
        sc.close();
    }
}
