/* find employees yearly salary using inputs as the no of hours employee works
per week and the amount he's paid per hour. Also take vacation days as input,
each vacation day consuming 8 hours of employee's work hours */
import java.util.Scanner;

public class EmployeeSalary {
    public static void calculateEmployeeSalary(double workingHoursPerWeek, double incomePerHour) {
        double weeksPerYear = 365/7;
        double idealWorkingHoursPerYear = workingHoursPerWeek * weeksPerYear;
        System.out.println("Enter vacation days taken");
        Scanner input = new Scanner(System.in);
        int vacationDays = input.nextInt();
        int vacationHours = vacationDays * 8;
        double actualWorkingHoursPerYear = idealWorkingHoursPerYear - vacationHours;
        double yearlyEmployeeSalary = actualWorkingHoursPerYear * incomePerHour;

        System.out.println("Employee's gross salary in USD is: " + yearlyEmployeeSalary);
        input.close();
    }
    public static void main(String[] args) {
        calculateEmployeeSalary(40, 80);
    }
}