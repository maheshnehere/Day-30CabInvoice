package com.bridgelabz;
import java.util.HashMap;
import java.util.Scanner;
public class Cab_invoice {
    public static void main(String[] args) {
        HashMap<Double,Double> map = new HashMap();
        Scanner sc = new Scanner(System.in);

        double costPerKmForNormalRide = 10;
        double costPerKmForPremiumRide = 15;
        double costPerminForNormalRide = 1;
        double costPerminForPremiumRide = 2;
        double minFareForNormalRide = 5;
        double minFareForPremiumRide = 20;
        double totalDistance =0;
        double totalTime =0;
        double totalFare = 0;
        double averageFair = 0;
        int count =0;

        System.out.println("Select ride from the following , Press 1.Normal Ride 2.Premium Ride");
        int option = sc.nextInt();

        System.out.println("Enter number of rides");
        double rides = sc.nextDouble();

        for (int i = 1; i <= rides; i++) {
            System.out.println("RIDE ="+i);
            System.out.println("Enter the distance in km");
            double distance = sc.nextDouble();
            System.out.println("Enter the time in minutes.");
            double time = sc.nextDouble();

            map.put(distance,time);

            totalDistance += distance;
            totalTime += time;
            count++;
        }

        if (option == 1) {
            totalFare = (totalDistance * costPerKmForNormalRide) + (totalTime * costPerminForNormalRide) + (minFareForNormalRide * count);
            averageFair = totalFare / count;
        }else if (option == 2){
            totalFare = (totalDistance * costPerKmForPremiumRide) + (totalTime * costPerminForPremiumRide) + (minFareForPremiumRide * count);
            averageFair = totalFare / count;
        }
        System.out.println("List of All rides (Distance = Time) respectively =");
        System.out.println(map);
        System.out.println("Total Fare is = " + totalFare);
        System.out.println("Total Number of Rides = "+count);
        System.out.println("Average Fare per ride = "+averageFair);
    }
    }