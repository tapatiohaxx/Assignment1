package org.CS5800.Inheritance;

public class  EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        BaseEmployee renwa = new BaseEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        System.out.println("Salaried Employee: " + joe.getFirstName() + " " + joe.getLastName() + ", SSN: " + joe.getSsn() + ", Weekly Salary: $" + joe.getWeeklySalary());
        System.out.println("Hourly Employee: " + stephanie.getFirstName() + " " + stephanie.getLastName() + ", SSN: " + stephanie.getSsn() + ", Wage: $" + stephanie.getWage() + ", Hours Worked: " + stephanie.getHoursWorked());
        System.out.println("Hourly Employee: " + mary.getFirstName() + " " + mary.getLastName() + ", SSN: " + mary.getSsn() + ", Wage: $" + mary.getWage() + ", Hours Worked: " + mary.getHoursWorked());
        System.out.println("Commission Employee: " + nicole.getFirstName() + " " + nicole.getLastName() + ", SSN: " + nicole.getSsn() + ", Commission Rate: " + (nicole.getCommissionRate() * 100) + "%, Gross Sales: $" + nicole.getGrossSales());
        System.out.println("Base Employee: " + renwa.getFirstName() + " " + renwa.getLastName() + ", SSN: " + renwa.getSsn() + ", Base Salary: $" + renwa.getBaseSalary());
        System.out.println("Base Employee: " + mike.getFirstName() + " " + mike.getLastName() + ", SSN: " + mike.getSsn() + ", Base Salary: $" + mike.getBaseSalary());
        System.out.println("Commission Employee: " + mahnaz.getFirstName() + " " + mahnaz.getLastName() + ", SSN: " + mahnaz.getSsn() + ", Commission Rate: " + (mahnaz.getCommissionRate() * 100) + "%, Gross Sales: $" + mahnaz.getGrossSales());
        }
    }