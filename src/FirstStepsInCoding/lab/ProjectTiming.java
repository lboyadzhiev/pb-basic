package FirstStepsInCoding.lab;

import java.util.Scanner;

public class ProjectTiming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        int neededTime = count * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, neededTime, count);
    }
}
