public class Main {

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator(18, 49, 60);
        System.out.println(salaryCalculator.calculateWeekSalary());

        SalaryCalculator salaryCalculator2 = new SalaryCalculator(18, 65, 62);
        System.out.println(salaryCalculator2.calculateWeekSalary());

        SalaryCalculator salaryCalculator3 = new SalaryCalculator(18, 70, 70);
        System.out.println(salaryCalculator3.calculateWeekSalary());

        SalaryCalculator salaryCalculator4 = new SalaryCalculator(20, 38, 55);
        System.out.println(salaryCalculator4.calculateWeekSalary());


        SalaryCalculator salaryCalculator5 = new SalaryCalculator(10, 42, 40);
        System.out.println(salaryCalculator5.calculateWeekSalary());

        SalaryCalculator salaryCalculator6 = new SalaryCalculator(12, 40, 40);
        System.out.println(salaryCalculator6.calculateWeekSalary());
    }

}
