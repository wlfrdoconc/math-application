package com.pluralsight;

import static java.lang.Math.*;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        // Create two variables that represent the salary of Bob and Gary
        double bobSalary = 100500.99;
        double garySalary = 85600.99;

        // Determine which salary is greater using the Math.max() function
        // Create a new variable named highestSalary to store the result
        double highestSalary = Math.max(bobSalary, garySalary);

        // Print out the highest salary
        System.out.println("The highest salary is $" + highestSalary);

        // Question 2
        // Find and display the smallest of two variables named carPrice and truckPrice
        double carPrice = 25999.99;
        double truckPrice = 49999.99;
        double lowestPrice = Math.min(carPrice, truckPrice);

        // Print out the lowest price
        System.out.println("The lowest price is $" + lowestPrice);

        // Question 3
        // Find and display the area of a circle whose radius is 7.25
        double circleRadius = 7.25;
        double circleArea = Math.PI * circleRadius * circleRadius;
        System.out.printf("The area of the circle is %.2f%n", circleArea);

        // Question 4
        // Find and display the square root of a variable after it is set to 5.0
        double setNumber = 5.0;
        double squareRoot = sqrt(setNumber);
        System.out.printf("The square root of %.1f is %.2f%n", setNumber, squareRoot);

        // Question 5
        // Find and display the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("The distance between the points is %.2f%n", distance);

        // Question 6
        // Find and display the absolute (positive) value of a variable
        double value = -3.8;
        double absoluteValue = Math.abs(value);
        System.out.println("The absolute value of " + value + " is " + absoluteValue);

        // Question 7
        // Find and display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("Random number: " + randomNumber);

        // Question 8
        // Calculate how many minutes are in 24 days
        // Use a variable for each value you calculate with

        int givenDays = 24;
        int hoursInDays = 24;
        int minutesInHours = 60;

        System.out.println("There are " + (givenDays * hoursInDays * minutesInHours) + " minutes in 24 days");

        // Bonus: How many milliseconds are in 24 days?

        int secondsInMinutes = 60;
        long millisecondsInSeconds = 1000L; // Use long over int to hold the resulting number of milliseconds
        System.out.println("There are " + (givenDays * hoursInDays * minutesInHours * secondsInMinutes * millisecondsInSeconds) + " milliseconds in 24 days");
    }
}
