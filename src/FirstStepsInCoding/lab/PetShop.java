package FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogs = Integer.parseInt(scan.nextLine());
        int rest = Integer.parseInt(scan.nextLine());

        double dogsFood = dogs * 2.50;
        double restFood = rest * 4;

        double result = dogsFood + restFood;

        System.out.printf("%.2f lv.", result);
    }
}
