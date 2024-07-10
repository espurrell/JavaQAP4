package Problem4;

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        try {
            // prompt for and read in a line of input
            System.out.print("Enter a line of text: ");
            String line = scan.nextLine();
            Scanner scanLine = new Scanner(line);

            // process the line one token at a time
            while (scanLine.hasNext()) {
                try {
                    int num = Integer.parseInt(scanLine.next());
                    sum += num;
                } catch (NumberFormatException e) {
                    // empty catch block
                }
            }

            // close the scanLine scanner
            scanLine.close();
        } finally {
            // close the main scanner
            scan.close();
        }

        System.out.println("The sum of the integers on the line is " + sum);
    }
}