import java.util.Scanner;

public class Problema30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("aqui tienes tu patron =)....!!!");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for (int j = i+1; j <= rows; j++){}

            System.out.println();
        }

        sc.close();
    }
}