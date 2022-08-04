package day08_Single_If_statement;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyHours= 45;
        double stateTaxRate = 6.5,
                federalTax = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate/100;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("state tax = $" + stateTax);
    }
}
