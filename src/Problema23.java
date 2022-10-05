/*23: Design an algorithm that reads a set of grades form the keyboard until a -1 is
        entered and it writes the average grade and if there was a 10 or not.*/

import java.util.Scanner;
class Problema23 {
    public static void main(String[] argv) {
        float grade = 0, sum = 0;
        boolean wasTen = false;
        int i = 0;
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        while (grade != -1) {
            grade = inputValue.nextFloat();
            if (grade != -1) {
                sum = sum + grade;
                i = i + 1;
                if (grade == 10) {
                    wasTen = true;
                }
            }
        }
        System.out.println("Average: " + sum / i);
        if (wasTen) {
            System.out.println("There was a 10");
        } else {
            System.out.println("There was not a 10");
        }
    }
}