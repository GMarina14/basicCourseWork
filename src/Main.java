public class Main {
    public static void main(String[] args) {
        int size = 10;
        Employee[] employees = new Employee[size];

     /*Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3 *//*employees.length*//*; ++i) {
            System.out.println("Enter the full name, the department (1-5) and the salary of an employee N" + (i + 1) + ": ");
            employees[i] = new Employee(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
        }
        scanner.close();To check functionality

      Employee[] employees = new Employee[3];
        employees[0]= new Employee("Sara", 5, 15000);
        employees[1]= new Employee("Nick", 1, 17000);
        employees[2]= new Employee("Lidia", 2, 11000);
*/

        System.out.println("List of employees:");
        Employee.listOfEmployees(employees);

        System.out.println("The total costs of employees salaries per month: " + Employee.salaryCosts(employees));
        System.out.println("Employee with the minimum wage is " + Employee.minSalaryEmployee(employees).getName());
        System.out.println("Employee with the maximum wage is " + Employee.maxSalaryEmployee(employees).getName());
        System.out.println("The average salary is " + Employee.averageSalary(employees));
        System.out.println("List of employees names:");
        Employee.listOfEmployeesNames(employees);

        System.out.println("Some info:");
        System.out.println(employees[2].getName());
        System.out.println(employees[2].getIdOfEmployee());
        System.out.println(employees[2].getDepartment());
        System.out.println(employees[2].getSalary());
    }
}
