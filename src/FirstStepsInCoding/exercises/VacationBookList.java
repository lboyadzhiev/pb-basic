package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pagesCount = Integer.parseInt(scan.nextLine());
        int pageForHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int totalTime = pagesCount / pageForHour;

        int neededDays = totalTime / days;

        System.out.println(neededDays);

    }
}
