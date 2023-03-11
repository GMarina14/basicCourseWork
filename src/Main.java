import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        Employee[] employees = new Employee[size];

        /*String nameOfEmployee="";
        int department = 0;
        double salaryOfEmployee=0d;

        Scanner scanner = new Scanner(System.in);

       for (int i = 0; i < 10 ; ++i) {
           System.out.println("Enter the full name of an employee N" + (i + 1) + ": ");
           nameOfEmployee = scanner.nextLine();
           // scanner.nextLine();
           System.out.println("Enter the department (1-5) of an employee N" + (i + 1) + ": ");
           department = scanner.nextInt();
           scanner.nextLine();
           System.out.println("Enter the salary of an employee N" + (i + 1) + ": ");
           salaryOfEmployee = scanner.nextDouble();
           scanner.nextLine();
           employees[i] = new Employee(nameOfEmployee, department, salaryOfEmployee);

       }
        scanner.close();*/


        employees[0] = new Employee("Sara Fisher", 5, 15000);
        employees[1] = new Employee("Nick Radclyffe", 1, 17000);
        employees[2] = new Employee("Lidia Sinn", 2, 11000);
        employees[3] = new Employee("Andy Garcia", 3, 18500.7);
        employees[4] = new Employee("Anna Boil", 4, 17450.60);
        employees[5] = new Employee("Kaila Harlan", 2, 25897.4);
        employees[6] = new Employee("Nadia Song", 1, 16879.5);
        employees[7] = new Employee("Lana Fillips", 4, 187964);
        employees[8] = new Employee("Jack Becket", 3, 31589.7);
        employees[9] = new Employee("Wilfred Tasker", 5, 78589.7);

        System.out.println("List of employees:");
        Employee.listOfEmployees(employees);
        System.out.println();

        System.out.println("The total costs of employees salaries per month: " + Employee.salaryCosts(employees) + " rubles");
        System.out.println("Employee with the minimum wage is " + Employee.minSalaryEmployee(employees).getName());
        System.out.println("Employee with the maximum wage is " + Employee.maxSalaryEmployee(employees).getName());
        System.out.println("The average salary is " + Employee.averageSalary(employees) + " rubles");
        System.out.println("List of employees names:");
        Employee.listOfEmployeesNames(employees);
        System.out.println();

        System.out.println("Some random info:");
        System.out.println(employees[2].getName());
        System.out.println(employees[2].getIdOfEmployee());
        System.out.println(employees[2].getDepartment());
        System.out.println(employees[2].getSalary());
        System.out.println("It's time to index the salary");
        Employee.indexSalary(employees, 15);
        for (Employee empl : employees) {
            System.out.println(empl);
        }
        System.out.println();
        System.out.println("Info about the employees with the salary more than 15000 rubles");
        Employee.lessSalary(employees, 15000.0);
        System.out.println("Info about the employees with the salary less than 15000 rubles");
        Employee.moreSalary(employees, 15000.0);

        System.out.println("Data about some exact department's employees");

        System.out.println("Employee with the maximum wage in the department is " + Employee.employeeWithMaxSalaryOfDepartment(employees, 2).getName());
        System.out.println("Employee with the minimum wage in the department is " + Employee.employeeWithMinSalaryOfDepartment(employees, 1).getName());
        System.out.println("The total costs of employees salaries of the department per month: " + Employee.salaryCostsOfDepartment(employees, 3) + " rubles.");
        System.out.println("The average salary of the department is " + Employee.averageSalaryOfDepartment(employees, 4) + " rubles");
        System.out.println("Indexing the salary of the department");
        Employee.indexSalaryOfDepartment(employees, 12, 5);
        Employee.listOfEmployeesOfDepartment(employees, 1);
        System.out.println("Also data about the department is available this way");
        Employee.infoAboutDepartment(employees, 5);
    }
}
