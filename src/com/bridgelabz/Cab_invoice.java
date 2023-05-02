package com.bridgelabz;
import java.util.Scanner;
public class Cab_invoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km");
        double distance = sc.nextDouble();
        System.out.println("Enter the time in minutes.");

        //Uc1 - Calculate Fare.
        double time = sc.nextDouble();
        double totalFare;

        double costPerKm = 10;
        double costPermin = 1;
        double minFare = 5;
        totalFare = (distance * costPerKm) + time + minFare;
        System.out.println("Total Fare is = " + totalFare);
    }
    }