package JavaStdinandStdoutI;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        while (scan.hasNextInt()) {
            counter++;
            System.out.println(scan.nextInt());
            if (counter == 3)
                break;
        }
    }
}
