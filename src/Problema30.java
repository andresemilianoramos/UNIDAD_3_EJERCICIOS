import java.util.Scanner;
class Problema30{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print ("Introduzca un número");
        int n=s.nextInt();
        for (int i = 1; i <= n; i ++) {// número de filas
            for (int k = 1; k <= (n-i); k ++) {// Número de espacios por línea
                System.out.print("  /");
            }
            for(int x=-(i-1);x<=i-1;x++){
                System.out.printf ("% 3d", Math.abs (x) +1); // La salida es un valor absoluto

            }
            for (int k = 1; k <= (n-i); k ++) {// Número de espacios por línea
                System.out.print("  /");}
            System.out.println();
        }

    }

}