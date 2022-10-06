
import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {

        float numero; // este es mi argumento, por eso al principio del codigo
        // a partir de aca escribo el codigo para que lea el numero a ingresar en pantalla
        System.out.println("INGRESA UN NUMERO PARA SABER SI ES POSITIVO O NEGATIVO");

        Scanner inputValue;
        inputValue= new Scanner (System.in);
        numero = inputValue.nextFloat();
        //con sus condiciones
        // condicion 1: si el numero es mayor que 0 (>=0) sera un numero positivo
        if (numero>=0) {
            /*abrimos corchete para anidar la respuesta a revelar*/ System.out.println("EL NUMERO ES POSITIVO");
        } //cerramos corchetes
        else { /*añadimos la doble decision ELSE... para cuando el numero sea menor q 0*/
            System.out.println("EL NUMERO ES NEGATIVO");

        }

    }
}

