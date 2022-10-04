import javax.swing.*;

public class Problema18 {
    public static void main(String[] args) {

        double horasTrabajadas;
        double salarioTotal;
        double hourlyWage; // sueldo por horas // 16$ las primeras 40 horas
        final  double primerasHoras = 35; // primeras 40 horas trabajadas

        hourlyWage = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de tu hora trabajada"));
        horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese horas trabajadas"));
        double extraSalaryPlus40 = hourlyWage * 1.5;


        if (horasTrabajadas <= primerasHoras){
            salarioTotal = horasTrabajadas * hourlyWage;
        } else {
            salarioTotal = (primerasHoras * hourlyWage) + ((horasTrabajadas - primerasHoras)*extraSalaryPlus40);
        }
        System.out.println("El salario total es: "+salarioTotal+"€; (monto en bruto a percibir)");
// vamos con el calculo de los taxes.
        double salarioImpuesto1 = salarioTotal - 500;
        double menosEl25= salarioImpuesto1 - (salarioImpuesto1 * 0.25);
        double salarioMenos900eu = salarioTotal - 900;
        double menosEl45porciento = salarioMenos900eu - (salarioMenos900eu * 0.45);
        double variableY= 400 - (400*0.25);
        double totalSiExcede900eu= (500 + variableY + menosEl45porciento);

        if (salarioTotal <=500){
            salarioTotal = salarioTotal;
            System.out.println("Salario libre de impuestos");
            JOptionPane.showMessageDialog(null, "Felicidades!");

        } else if (salarioTotal >501 && salarioTotal <=900) {
            System.out.println("500€ estan libres de impuestos.");
            System.out.println("A: "+menosEl25+"€ se le deduce el 25% de impuestos");
            System.out.println("Siendo: ");
            salarioTotal = 500 + menosEl25;

        } else {
            System.out.println("Por lo que a: "+salarioMenos900eu+ "€ se le deduce el 45% de impuestos");
            System.out.println("Y a 400€ se le deduce el 25%");
            System.out.println("Siendo: ");
            salarioTotal= totalSiExcede900eu;
        }
        System.out.println("Tu salario neto es de: " +salarioTotal+ "€");

    }
}