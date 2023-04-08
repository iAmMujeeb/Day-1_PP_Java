package day_1_pp;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        if((year%4==0)||(year%400==0))
            System.out.println("Leap Year");
        else
            System.out.println("Not A Leap Year");
    }
}
