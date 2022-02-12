package JavaIfElse;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        if (n%2 == 1 || (6<=n && n<=20))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}
