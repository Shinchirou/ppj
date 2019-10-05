public class SalaryCalculator {

    private final double MINSALARY = 12;
    private final double WEEKNORM = 40;
    private final double OVERHRS = 1.5;

    private double salary;
    private double hrsLogged;
    private double weekSalary;
    private double maxHrs;

    public SalaryCalculator(double salary, double hrsLogged, double maxHrs) {
        if (salary >= MINSALARY) {
            this.salary = salary;
        } else {
            this.salary = MINSALARY;
        }
        this.hrsLogged = hrsLogged;
        this.maxHrs = maxHrs;
    }

    public double calculateWeekSalary() {
        double overTimeLogged = 0;
        if (hrsLogged > maxHrs) {
            hrsLogged = maxHrs;
        }
        if (hrsLogged > WEEKNORM) {
            overTimeLogged = hrsLogged - WEEKNORM;
            hrsLogged = hrsLogged - overTimeLogged;
        }

        return (hrsLogged*salary) + (overTimeLogged*salary*OVERHRS);
    }



}
