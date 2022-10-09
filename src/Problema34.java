import java.util.Scanner;

public class Problema34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print(" How many precision terms do you want? We will use Newton's series: ");
        int n = sc.nextInt();

        System.out.print("e: " + e(n));
    }

    public static double e(int n) {
        double add = 0;
        double term;
        for (int i = 0; i < n; i++) {
            term = 1 / factorial(i);
            add += term;
        }

        return add;
    }

    public static double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i;
        }
        System.out.println("factorial= " + aux);
        return aux;

    }
}

