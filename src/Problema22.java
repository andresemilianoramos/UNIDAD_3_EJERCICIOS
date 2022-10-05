/*
Exercise for you to make:
Write the pseudocode using the equivalent While structure.

Diseña un algoritmo que escriba la suma de los 10 primeros
números naturales y el producto de los 10 primeros números naturales.

con el while---

while
sum=0; product=1
i=0;

while i<=10
mostrar: sum=sum + i
mostrar: product=product*i
end
write “sum from 1 to 10:” + sum
write “product from 1 to 10:” + product

 */
class Example22 {
    public static void main(String[] argv) {
        int sum, product;
        sum = 0;
        product = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            product = product * i;
        }
        System.out.println("Sum from 1 to 10:" + sum);
                System.out.println("Product from 1 to 10:" +
                        product);
    }
}

