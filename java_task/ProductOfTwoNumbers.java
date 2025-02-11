 //Q-5

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scan.nextInt();

        System.out.print("Input second number: ");
        int num2 = scan.nextInt();

        int product = num1 * num2;

        System.out.println(num1 + " x " + num2 + " = " + product);

        scan.close(); 
    }
}

