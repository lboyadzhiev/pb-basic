package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area = Double.parseDouble(scan.nextLine());

        double pricePerValue = 7.61;
        double price = area * pricePerValue;
        double discount = price * 0.18;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
