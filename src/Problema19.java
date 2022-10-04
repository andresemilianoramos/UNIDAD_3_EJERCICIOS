import java.util.Scanner;
class Problema19 {
    public static void main(String[] argv) {
        float price, discount, total;
        System.out.println("Enter the price:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        price = inputValue.nextFloat();
        if (price < 6) {
            discount = 0;
        } else {
            if (price < 60) {
                discount = price * 0.05f;
            } else {
                discount = price * 0.1f;
            }
        }
        total = price - discount;
        System.out.println("Final price is "+total);
    }
}