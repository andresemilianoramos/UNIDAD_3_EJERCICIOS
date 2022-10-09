import java.util.Scanner;

public class root {
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number:  ");
        n= sc.nextDouble();

        double x=n;
        double y;

        int i =10;

        while (i>0){y=0.5 * (x+n/x);
        x=y;
        i--;
            //System.out.println(i);
        }
        System.out.println("\n the result after iteration is: "+x);
    }
}


  /*  Ahora modifique el ejercicio anterior y deje de iterar cuando
| x - y | < 0,000001. No puede usar la función Math.abs().

25 - */