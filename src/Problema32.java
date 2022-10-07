import java.util.Scanner;

    public class Problema32 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = 1;

            System.out.println("Ingrese el valor de a: ");
            int a = sc.nextInt();
            for(int k = 1; k<10 ; k++){
                System.out.println(k);
                x = (x + a/x) / 2;
            }
            System.out.println("La raiz de " + a + " es de " + x);
        }

    }

/* | x - y | < 0.000001.

Calcule el valor de la raíz cuadrada para
 un número n usando la solución iterativa:
Dado x como un valor estimado (puede establecer x = n al principio),
cada iteración se calcula como: y = (x+ n/x) /2

Entonces puedes hacer x = y, y hacer otra iteración.
Calcula la raíz cuadrada de n para 10 iteraciones.

Ahora modifique el ejercicio anterior y deje de iterar cuando
| x - y | < 0,000001. No puede usar la función Math.abs().*/