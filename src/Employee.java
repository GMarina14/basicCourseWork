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
}
