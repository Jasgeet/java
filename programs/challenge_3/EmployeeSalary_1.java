/* Method-2
find employees yearly salary using inputs as the no of hours employee works
per week and the amount he's paid per hour. Also take vacation days as input,
each vacation day consuming 8 hours of employee's work hours */

public class EmployeeSalary_1 {
    public static double calculateEmployeeSalary(double workingHoursPerWeek, double incomePerHour, int vacationDays) {
        if(workingHoursPerWeek <= 0)
            return -1;
        if(incomePerHour <= 0)
            return -1;
        double weeklyPaycheck = workingHoursPerWeek * incomePerHour;
        double vacationSalaryDeduction = vacationDays * 8 * incomePerHour;
        return (weeklyPaycheck * 52) - vacationSalaryDeduction;
    }
    public static void main(String[] args) {
        double salary = calculateEmployeeSalary(40, 90, 15);
        System.out.println("Employee's yearly salary in USD is: " + salary);
    }    
}
