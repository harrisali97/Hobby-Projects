package com.example.learning;

import java.util.Scanner;

public class LearnAboutYourself {

    public static void main(String[] args) {
        // Create scanner object to get input
        Scanner scanner = new Scanner(System.in);

        // Collecting the user's basic information
        System.out.print("Enter your age (in years): ");
        int ageInYears = scanner.nextInt();

        System.out.print("Enter your height (in centimeters): ");
        int heightInCm = scanner.nextInt();

        System.out.print("Enter your weight (in kilograms): ");
        double weightInKg = scanner.nextDouble();

        System.out.print("How many steps do you walk per day on average? ");
        int stepsPerDay = scanner.nextInt();

        // Call methods to calculate and display the information
        calculateAgeInMonths(ageInYears);
        calculateBMI(weightInKg, heightInCm);
        estimateLifetimeSteps(ageInYears, stepsPerDay);
    }

    // Method to calculate age in months
    public static void calculateAgeInMonths(int ageInYears) {
        int ageInMonths = ageInYears * 12;
        System.out.println("You are " + ageInMonths + " months old.");
    }

    // Method to calculate BMI and display the result
    public static void calculateBMI(double weightInKg, int heightInCm) {
        // Convert height from cm to meters for the BMI formula
        double heightInM = heightInCm / 100.0;

        // BMI formula: BMI = weight (kg) / (height (m))^2
        double bmi = weightInKg / (heightInM * heightInM);
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));

        // Simple BMI classification
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }

    // Method to estimate lifetime steps based on daily steps
    public static void estimateLifetimeSteps(int ageInYears, int stepsPerDay) {
        int averageLifeExpectancy = 80;  // Assume an average life expectancy of 80 years
        int remainingYears = averageLifeExpectancy - ageInYears;

        // Calculate total steps for the remaining years
        long totalLifetimeSteps = (long) stepsPerDay * 365 * remainingYears;
        System.out.println("If you keep walking " + stepsPerDay + " steps per day, you will take approximately " +
                totalLifetimeSteps + " steps in your lifetime.");
    }
}

