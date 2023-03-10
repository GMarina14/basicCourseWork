import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Employee {
    private final String name;
    private int department;
    private double salary;
    private final int idOfEmployee;

    private static int id = 0;

    public Employee(String name, int department, double salary) {
        id++;
        idOfEmployee = id;
        this.name = name;
        setDepartment(department);
        //this.department = department;
        setSalary(salary);
        // this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        if (department <= 0 || department > 5) {
            throw new IllegalArgumentException("The department number has to be between 1 and 5 ");

        } else {
            this.department = department;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("The salary can not be negative");
        } else {
            this.salary = salary;
        }
    }

    public int getIdOfEmployee() {
        return idOfEmployee;
    }

    @Override
    public String toString() {
        return "Name of an employee " + name + ", id " + idOfEmployee +
                ", department number " + department +
                ", salary " + salary + " rubles.";
    }

    public static void listOfEmployees(Employee[] employees) {
        for (Employee worker : employees) {
            System.out.println(worker);
        }
    }

    public static double salaryCosts(Employee[] employees) {
        double salaryTotal = 0d;
        for (Employee worker : employees) {
            salaryTotal += worker.salary;
        }
        return salaryTotal;
    }

    public static Employee minSalaryEmployee(Employee[] employees) {
        int idNum = 0;
        double minSalary = employees[0].salary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary < minSalary) {
                minSalary = employees[i].salary;
                idNum = i;
            }
        }
        return employees[idNum];
    }

    public static Employee maxSalaryEmployee(Employee[] employees) {
        int idNum = 0;
        double maxSalary = employees[0].salary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > maxSalary) {
                maxSalary = employees[i].salary;
                idNum = i;
            }
        }
        return employees[idNum];
    }

    public static double averageSalary(Employee[] employees) {
        return salaryCosts(employees) / employees.length;
    }

    public static void listOfEmployeesNames(Employee[] employees) {
        for (Employee worker : employees) {
            System.out.println(worker.name);
        }
    }

    public static void indexSalary(Employee[] employees, double percentage) {
        for (Employee worker : employees) {
            worker.salary += (worker.salary * percentage / 100);
        }
    }


    public static Employee employeeWithMinSalaryOfDepartment(Employee[] employees, int department) {
        double minSalary = 0.0;
        int workerMinId = 0;
        for (Employee worker : employees) {
            if (worker.department == department) {
                minSalary = worker.salary;
                break;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department == department) {
                if (employees[i].salary < minSalary) {
                    minSalary = employees[i].salary;
                    workerMinId = i;
                }
            }
        }
        return employees[workerMinId];
    }

    public static Employee employeeWithMaxSalaryOfDepartment(Employee[] employees, int department) {
        double maxSalary = 0.0;
        int workerMaxId = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department == department) {
                if (employees[i].salary > maxSalary) {
                    maxSalary = employees[i].salary;
                    workerMaxId = i;
                }
            }
        }
        return employees[workerMaxId];
    }

    public static double salaryCostsOfDepartment(Employee[] employees, int department) {
        double salaryTotal = 0d;
        for (Employee worker : employees) {
            if (worker.department == department) {
                salaryTotal += worker.salary;
            }
        }
        return salaryTotal;
    }

    public static double averageSalaryOfDepartment(Employee[] employees, int department) {
        int workers = 0;
        for (Employee worker : employees) {
            if (worker.department == department) {
                workers++;
            }
        }
        return salaryCostsOfDepartment(employees, department) / workers;
    }

    public static void indexSalaryOfDepartment(Employee[] employees, double percentage, int department) {
        for (Employee worker : employees) {
            if (worker.department == department) {
                worker.salary += (worker.salary * percentage / 100);
            }
        }
    }

    public static void listOfEmployeesOfDepartment(Employee[] employees, int department) {
        System.out.println("The list of employees of the department N " + department);
        for (Employee worker : employees) {
            if (worker.department == department) {
                System.out.println("The name of an employee is " + worker.name);
                System.out.println("The id of an employee is " + worker.idOfEmployee);
                System.out.println("The salary of an employee is " + worker.salary+" rubles");
                System.out.println();
            }
        }
    }

    public static void moreSalary(Employee[] employees, double salaryRange) {
        System.out.println("The list of employees with the salary less than " + salaryRange + " rubles:");
        for (Employee worker : employees) {
            if (worker.salary < salaryRange) {
                System.out.println("The id of an employee is " + worker.idOfEmployee);
                System.out.println("The name of an employee is " + worker.name);
                System.out.println("The salary of an employee is " + worker.salary + " rubles.");
                System.out.println();
            }
        }
    }

    public static void lessSalary(Employee[] employees, double salaryRange) {
        System.out.println("The list of employees with the salary more than " + salaryRange + " rubles:");
        for (Employee worker : employees) {
            if (worker.salary >= salaryRange) {
                System.out.println("The id of an employee is " + worker.idOfEmployee);
                System.out.println("The name of an employee is " + worker.name);
                System.out.println("The salary of an employee is " + worker.salary + " rubles.");
                System.out.println();
            }
        }
    }

    public static void infoAboutDepartment(Employee[] employees, int department) {
        int workersOfDepartment = 0;
        for (Employee worker : employees) {
            if (worker.department == department) {
                workersOfDepartment++;
            }
        }
        Employee[] employeesOfDepartment = new Employee[workersOfDepartment];

        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i].department == department) {
                employeesOfDepartment[j] = employees[i];
                j++;
            }
        }
        System.out.println("Employee with the minimum wage of the department is " + Employee.minSalaryEmployee(employeesOfDepartment).getName());
        System.out.println("Employee with the maximum wage of the department is " + Employee.maxSalaryEmployee(employeesOfDepartment).getName());
        System.out.println("The total costs of employees salaries of the department per month: " + Employee.salaryCosts(employeesOfDepartment) + " rubles.");
        System.out.println("The average salary is " + Employee.salaryCosts(employeesOfDepartment) / workersOfDepartment + " rubles.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage of the salary's indexation: ");
        double indexRate;
        indexRate = scanner.nextDouble();
        indexSalary(employeesOfDepartment, indexRate);
        scanner.close();


        for (Employee worker : employeesOfDepartment) {
            System.out.println("The name of an employee is " + worker.name);
            for (Employee empl : employees) {
                if (empl.name.equals(worker.name)) {
                    System.out.println("The id of an employee is " + empl.idOfEmployee);
                }
            }
            System.out.println("The salary of an employee is " + worker.salary + " rubles.");
            System.out.println();
        }
    }

}
