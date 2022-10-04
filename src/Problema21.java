import java.util.Scanner;
class Problema21 {
    public static void main(String[] argv) {
        double positives, i, num;
//Reading the value
        System.out.println("ingresa 10 numeros, presiona enter tras cada numero ingresado");
        Scanner inputValue;
        inputValue=new Scanner(System.in);
        i = 0;
        positives = 0;
        while (i < 10) {
            num = inputValue.nextDouble();
            if (num >= 0) {
                positives = positives +1;
            }
            i = i + 1;
        }
        System.out.println(positives + " positives");
    }
}