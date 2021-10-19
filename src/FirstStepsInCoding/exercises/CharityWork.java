package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class CharityWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int pastryChefs = Integer.parseInt(scan.nextLine());

        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakesPrice = 45;
        double wafflePrice = 5.80;
        double pancakesPrice = 3.20;

        double cakesProfit = cakes * cakesPrice;
        double waffleProfit = waffles * wafflePrice;
        double pancakesProfit = pancakes * pancakesPrice;

        double dailyProfit = (cakesProfit + waffleProfit + pancakesProfit) * pastryChefs;
        double totalProfit = dailyProfit * days;
        double costs = totalProfit / 8;
        double netProfit = totalProfit - costs;

        System.out.printf("%.2f", netProfit);
    }
}
