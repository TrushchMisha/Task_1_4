package com.tm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Day: ");
        String a = scanner.nextLine();
        System.out.println("Time(hours): ");
        String b = scanner.nextLine();

        int n = Integer.parseInt(b);
        if((a.equals("Friday") || a.equals("Monday")) && (n >=18 && n<=20)) {
            System.out.println("Lesson is running. You are late! Hurry up!");
        } else {
            System.out.println("Lesson is not running.");
        }
    }
}
