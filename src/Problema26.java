import java.util.Scanner;

public class Problema26 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        boolean comprobar = true;


        while (comprobar == true){

        System.out.println(" Ingresar numero natural para calcular sus divisores: ");
        int ingresarNumero = numero.nextInt();

        if (ingresarNumero > 0) {
            for (int i = 1; i <= ingresarNumero; i++) {
                if (ingresarNumero % i == 0) {
                    System.out.print("\n - " + i + " - ");
                }
                comprobar = false;
            }
            System.out.println("\n ");
            System.out.println("\n -        FIN        -  ");

        }
        }
    }
}