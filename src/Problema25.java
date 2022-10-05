import java.util.Scanner;

public class Problema25 {
   /*25.- Diseña un algoritmo que lea un número natural y escriba toda su tabla de multiplicar.*/
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        boolean comprobar = true;
        int numero, MULTIPLICADOR;

while (comprobar == true){ //coloco la variable while para que el programa siga ejecutandose hasta ingresar un numero correcto.
        System.out.println("Ingrese un numeor entero positivo: ");
        numero = lector.nextInt();
    System.out.println("¿Hasta que número deseas multiplicarlo?");
        MULTIPLICADOR = lector.nextInt(); //  ya que nos solicitan toda la tabla, lo cual es infinito... para hacerlo mas amigable he añadido esta variable.

        if(numero>0) {

            for (int i = 0; i <= MULTIPLICADOR; i++) {
                System.out.println(numero + " X " + i + " es igual a: " + numero * i);
            }
            System.out.println("\n FIN DE LOS CÁLCULOS =)");
            comprobar = false; // para que el while detenga el programa colocamos esto
        }
        else {
            System.out.println("el numero ingresado no es correcto");
            System.out.println("Intentelo nuevamente");
        }
       }

    }
}
