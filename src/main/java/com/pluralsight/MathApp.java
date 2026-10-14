package com.pluralsight;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        // Create two variables that represent the salary of Bob and Gary
        double bobSalary = 100500.99;
        double garySalary = 85600.99;

        // Determine which salary is greater using the Math.max() function
        // Create a new variable named highestSalary to store the result
        double highSalary = Math.max(bobSalary, garySalary);

        // Print out the highest salary
        System.out.println("The highest salary is $" + highSalary);

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
        System.out.println("The area of a circle whose radius is " + circleArea);

        // Question 4
        // Find and display the square root of a variable after it is set to 5.0
        double setNumber = 5.0;
        double squareRoot = sqrt(setNumber);
        System.out.println("The square root of " + setNumber + " is " + squareRoot);

        // Question 5
        // Find and display the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;

        System.out.println("The points are " + "(" + x1 + ", " + y1 + ") " + "and " + "(" + x2 + ", " + y2 + ")");

        // Question 6
        // Find and display the absolute (positive) value of a variable
        int value = -25;
        int absoluteValue = Math.abs(value);
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
        int millisecondsInSeconds = 1000;
        System.out.println("There are " + (givenDays * hoursInDays * minutesInHours * secondsInMinutes * millisecondsInSeconds) + " milliseconds in 24 days");
    }
}
