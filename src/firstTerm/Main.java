package firstTerm;

public class Main {
    public static Employee[] repository = new Employee[10];
    public static Employee employeeWithMinSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        Employee minSalary = employeeWithMaxSalary();
        for (Employee employee : repository) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }
    public static Employee employeeWithMaxSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        Employee maxSalary = employeeWithMinSalary();
        for (Employee employee : repository) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    public static double totalSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        double totalSalary = 0;
        for (Employee salary : repository) {
            if (salary.getDepartment() == department) {
                totalSalary += salary.getSalary();
            }
        }
        return totalSalary;
    }
    public static double avgSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        double totalSalary = totalSalaryInDepartment(department);
        int peopleInDepartment = 0;
        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                peopleInDepartment++;
            }
        }
        return totalSalary / peopleInDepartment;
    }
    public static void changeSalaryInDepartment(int department, double percentage) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        for (Employee salary : repository) {
            if (salary.getDepartment() == department) {
                salary.setSalary (salary.getSalary() * percentage / 100 + salary.getSalary());
            }
        }
    }
    public static void printAllEmployeesInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    public static void employeesWithLesserSalary(double comparingSalary) {
        for (Employee employee : repository) {
            if (employee.getSalary() < comparingSalary) {
                System.out.println(employee);
            }
        }
    }
    public static void employeesWithGreaterSalary(double comparingSalary) {
        for (Employee employee : repository) {
            if (employee.getSalary() >= comparingSalary) {
                System.out.println(employee);
            }
        }
    }
    public static void changeSalary(double percentage) {
        for (Employee salary : repository) {
            salary.setSalary (salary.getSalary() * percentage / 100 + salary.getSalary());
        }
    }
    public static void printAllEmployeesInfo() {
        for (Employee employee : repository) {
            System.out.println(employee);
        }
    }
    public static double totalSalary() {
        double totalSalary = 0;
        for (Employee salary : repository) {
            totalSalary += salary.getSalary();
        }
        return totalSalary;
    }
    public static Employee employeeWithMinSalary () {
        Employee minSalary = repository[0];
        for (Employee salary : repository) {
            if (minSalary.getSalary() > salary.getSalary()) {
                minSalary = salary;
            }
        }
        return minSalary;
    }
    public static Employee employeeWithMaxSalary () {
        Employee maxSalary = repository[0];
        for (Employee salary : repository) {
            if (maxSalary.getSalary() < salary.getSalary()) {
                maxSalary = salary;
            }
        }
        return maxSalary;
    }
    public static double avgSalary() {
        return totalSalary() / repository.length;
    }
    public static void printAllNames() {
        for (Employee name : repository) {
            System.out.println(name.getFullName());
        }
    }
    public static void main(String[] args) {
        repository[0] = new Employee("Ivan Ivanov", 1, 100_000);
        repository[1] = new Employee("Alexander Morozov", 2, 120_000);
        repository[2] = new Employee("Danil Smirnov", 3, 200_000);
        repository[3] = new Employee("Dima Kuznetsov", 4, 145_000);
        repository[4] = new Employee("Lev Petrov", 5, 160_000);
        repository[5] = new Employee("Maksim Sokolov", 1, 270_000);
        repository[6] = new Employee("Mikhail Zhukov", 2, 90_000);
        repository[7] = new Employee("Evgenii Voronov", 3, 85_000);
        repository[8] = new Employee("Andrei Zaitsev", 4, 110_000);
        repository[9] = new Employee("Vitaly Belov", 5, 130_000);
        printAllEmployeesInfo();
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary());
        System.out.println("Работник с минимальной зарплатой: " + employeeWithMinSalary());
        System.out.println("Работник с максимальной зарплатой: " + employeeWithMaxSalary());
        System.out.println("Средняя зарплата: " + avgSalary());
        printAllNames();
        changeSalary(15.5);
        employeesWithLesserSalary( 200_000);
        employeesWithGreaterSalary( 200_000);
        System.out.println(employeeWithMinSalaryInDepartment( 4));
        System.out.println(employeeWithMaxSalaryInDepartment( 4));
        System.out.println(totalSalaryInDepartment( 4));
        System.out.println(avgSalaryInDepartment( 4));
        changeSalaryInDepartment( 4, 15);
        printAllEmployeesInDepartment( 4);
    }
}