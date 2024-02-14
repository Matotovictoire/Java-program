import java.util.Scanner;
public class GrossSalaryCalculator {
    public static void main(String[] args) {
        double salary;
        double hra, da;
        Scanner sal = new Scanner(System.in);
        System.out.println("Enter you salary for the calcualtion: ");
        salary = sal.nextDouble();
        if(salary <= 10000){
            hra = 0.2 * salary;
            da = 0.8 * salary;
        }else if(salary <= 20000){
            hra = 0.25 * salary;
            da = 0.9 * salary;
        }else {
            hra = 0.3 * salary;
            da = 0.95 * salary;
        }

        // calculate gross salary
        double grossSalary = salary + hra + da;

        //output gross salary
        System.out.println("Gross Salary: "+ grossSalary);

    }
}
