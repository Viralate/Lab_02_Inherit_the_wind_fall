package main;
public class SalaryWorker extends Worker {
    private double annualSalary;

    // Constructor
    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, 0);  // No hourly rate needed
        this.annualSalary = annualSalary;
    }

    // Override calculateWeeklyPay
    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    // Override displayWeeklyPay
    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.println("Weekly pay: $" + (annualSalary / 52));
    }

    // Overloaded toCSV(), toXML(), toJSON() methods to include new field
}
