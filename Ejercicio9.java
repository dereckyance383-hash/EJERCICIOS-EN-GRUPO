import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioTarifa, precioPagado;

        System.out.print("Ingrese el precio de tarifa: ");
        precioTarifa = sc.nextDouble();
        System.out.print("Ingrese el precio pagado: ");
        precioPagado = sc.nextDouble();

        if (precioTarifa > 0) {
            double porcentaje = ((precioTarifa - precioPagado) / precioTarifa) * 100;
            System.out.println("Porcentaje descontado: " + porcentaje + "%");
        } else {
            System.out.println("El precio de tarifa debe ser mayor que cero.");
        }
        sc.close();
    }
}
