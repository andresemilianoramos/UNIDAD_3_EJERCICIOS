import java.util.Scanner;

public class Problema28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma =  0;
        System.out.print(" Ingresa un primer numero: ");
        double a = scanner.nextDouble();
        System.out.print(" Ingresa un segundo numero: ");
        double b = scanner.nextDouble();

        do {
            suma+= a; b--;
        } while (b !=0);
        System.out.println("\nse a definido el porducto por medio de sumas sucesivas: --> "+suma
        );
    }
}
