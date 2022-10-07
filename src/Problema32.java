import java.util.Scanner;


    public class Problema32 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = 1.0;
            System.out.println("Ingrese el valor de a: ");
            int a = sc.nextInt();
            int k;
            for(k = 1; k < 10; k++){
                x = (x + a/x) / 2;
            }
            System.out.println("La raiz de " + a + " después de " + (k - 1) + " iteraciones es de " + x);
        }

    }

/* | x - y | < 0.000001. */