import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHora, horas, salarioTotal, retencion, salarioNeto;

        System.out.print("Ingrese el valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.print("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();

        salarioTotal = valorHora * horas;
        retencion = salarioTotal * 0.05;
        salarioNeto = salarioTotal - retencion;

        System.out.println("Salario total: $" + salarioTotal);
        System.out.println("Retencion del 5%: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);
        sc.close();
    }
}
