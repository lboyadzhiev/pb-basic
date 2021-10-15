package FirstStepsInCoding.lab;

import java.util.Scanner;

public class smConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());

        double result  = a * 2.54;

        System.out.println(result);
    }
}
