package practices_1.task2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Predicate<Integer> function = number -> number % 2 == 0;
        if (function.test(number1)) {
            System.out.println("cutdur");
        } else {
            System.out.println("tekdir");
        }

    }

    ;
}

