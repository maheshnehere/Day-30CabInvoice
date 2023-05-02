package com.bridgelabz;
import java.util.HashMap;
import java.util.Scanner;
public class Cab_invoice {
    public static void main(String[] args) {
        HashMap<Double,Double> map = new HashMap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rides");
        double rides = sc.nextDouble();
        double costPerKm = 10;
        double costPermin = 1;
        double minFare = 5;
        double totalDistance =0;
        double totalTime =0;
        double totalFare;
        int count =0;

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

        totalFare = (totalDistance * costPerKm) + totalTime + (minFare * count);
        double averageFair = totalFare/count;

        System.out.println("List of All rides (Distance = Time) respectively =");
        System.out.println(map);
        System.out.println("Total Fare is = " + totalFare);
        System.out.println("Total Number of Rides = "+count);
        System.out.println("Average Fare per ride = "+averageFair);
    }
    }