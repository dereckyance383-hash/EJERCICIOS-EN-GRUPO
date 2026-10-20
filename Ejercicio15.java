import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorUnidad;
        int cantidad;

        System.out.print("Ingrese el valor por unidad: ");
        valorUnidad = sc.nextDouble();
        System.out.print("Ingrese la cantidad de articulos: ");
        cantidad = sc.nextInt();

        System.out.println("Valor total a pagar: $" + (valorUnidad * cantidad));
        sc.close();
    }
}
