import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args) {
        int year;
        Scanner x;

        System.out.println("ingrese el año a consultar: ");
        x=new Scanner(System.in);
        year=x.nextInt();

        if ((year%4==0) && (year%100 !=0 || year%400==0)){
            System.out.println("ES BISIESTO");
        } else {
            System.out.println("NO es bisiesto. ");
        }
    }
}