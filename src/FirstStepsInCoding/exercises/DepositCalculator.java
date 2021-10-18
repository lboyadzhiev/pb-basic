package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double deposit = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double interest = Double.parseDouble(scan.nextLine());

        double totalInterest = deposit * (interest / 100);
        double monthInterest = totalInterest / 12;
        double finalSum = deposit + (months * monthInterest);

        System.out.println(finalSum);
    }
}
