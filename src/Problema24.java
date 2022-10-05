import java.util.Scanner;

/*Diseñar un algoritmo para calcular el factorial de un número*/

public class Problema24 {
    public static void main(String[] args) {
  double factorial; double n;
        Scanner x;
        double auxiliar = 1;
        int i;
        System.out.println("ingrese numero: " );
        x = new Scanner(System.in);
        n = x.nextDouble();

        for
        (i = 2; i <= n; i++)
        {
            auxiliar = auxiliar * i;
        }
        System.out.println("El factorial de: " + n + "\n es: " + auxiliar);
    }
}
