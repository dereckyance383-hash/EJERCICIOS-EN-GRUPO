import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;

        System.out.print("Ingrese el precio del articulo antes del IVA: ");
        precio = sc.nextDouble();

        // Se usa 19% como supuesto; el enunciado no especifica la tarifa.
        double iva = precio * 0.19;
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Precio con IVA: $" + (precio + iva));
        sc.close();
    }
}
