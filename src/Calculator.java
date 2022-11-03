package src;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args ) {
        run();
    }

    public static void run() {
        System.out.println("Type number here");
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        System.out.println("Choose operation");
        System.out.println("+,-,*,/");
        String operation = scanner.next();
        System.out.println("Input next number");
        Integer nextNumber = scanner.nextInt() ;
        if (operation.equals("+")) {
            System.out.println(input + nextNumber);
        }
        if (operation.equals("-")) {
            System.out.println(input - nextNumber);
        }
        if (operation.equals("*")) {
            System.out.println(input * nextNumber);
        }
        if (operation.equals("/")) {
            System.out.println(new Double(input) / new Double(nextNumber));
        }
        

    }

}
