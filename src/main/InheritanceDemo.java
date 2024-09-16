package main;

import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Worker objects (including Worker and SalaryWorker)
        ArrayList<Worker> workers = new ArrayList<>();

        // Create 3 Worker instances
        workers.add(new Worker("John", "Doe", "001", "Mr.", 1985, 20.0));   // hourly rate: $20
        workers.add(new Worker("Jane", "Smith", "002", "Ms.", 1990, 22.5)); // hourly rate: $22.5
        workers.add(new Worker("Alice", "Johnson", "003", "Mrs.", 1975, 18.75)); // hourly rate: $18.75

        // Create 3 SalaryWorker instances
        workers.add(new SalaryWorker("Mark", "Williams", "004", "Dr.", 1980, 52000));  // annual salary: $52,000
        workers.add(new SalaryWorker("Chris", "Brown", "005", "Mr.", 1992, 60000));    // annual salary: $60,000
        workers.add(new SalaryWorker("Anna", "Taylor", "006", "Ms.", 1988, 75000));    // annual salary: $75,000

        // Weekly pay periods: 40 hours for week 1, 50 hours for week 2, 40 hours for week 3
        double[] hoursWorked = {40, 50, 40};

        // Loop through 3 weekly pay periods
        for (int week = 0; week < 3; week++) {
            System.out.println("Week " + (week + 1) + " Pay Period:");
            System.out.println("----------------------------------------");

            // Loop through each worker and display weekly pay
            for (Worker worker : workers) {
                worker.displayWeeklyPay(hoursWorked[week]);
                System.out.println(); // Add space between each worker's output
            }

            System.out.println("----------------------------------------\n");
        }
    }
}
