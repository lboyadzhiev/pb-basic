package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BirthDayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());

        double cake = rent * 0.20;
        double beverage = cake - (cake * 0.45);
        double staff = rent / 3;

        double finalPrice = rent + cake + beverage + staff;

        System.out.println(finalPrice);
    }
}
