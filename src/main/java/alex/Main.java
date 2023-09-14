package alex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String inputLine = scanner.nextLine();
        scanner.close();

        System.out.println("Result: " + StateMachine.check(inputLine));

    }
}
