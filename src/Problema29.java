import java.util.Scanner;

public class Problema29 {
    public static void main(String[] args) {
        Scanner ingresaNumero = new Scanner(System.in);

        int resultado=0;
        int dividendo;
        int divisor;


        System.out.println("ingresa el dividendo: ");
        dividendo=ingresaNumero.nextInt();
        System.out.println("ingresa el divisor: ");
        divisor=ingresaNumero.nextInt();

        int resto= dividendo%divisor; // para calcular el resto y seguir la opratividad

        //vamos con las condiciones!! =)


        while (dividendo>resto){
            resultado++;
            dividendo-=divisor;

                }
        System.out.print(resultado );
    }
}