package firstTerm;

public class Main {
    public static void printAllEmployeesInfo(Employee[] repository) {
        for (Employee employee : repository) {
            System.out.println(employee);
        }
    }
    public static int totalSalary(Employee[] repository) {
        int totalSalary = 0;
        for (Employee salary : repository) {
            totalSalary += salary.getSalary();
        }
        return totalSalary;
    }
    public static Employee employeeWithMinSalary (Employee[] repository) {
        Employee minSalary = repository[0];
        for (Employee salary : repository) {
            if (minSalary.getSalary() > salary.getSalary()) {
                minSalary = salary;
            }
        }
        return minSalary;
    }
    public static Employee employeeWithMaxSalary (Employee[] repository) {
        Employee maxSalary = repository[0];
        for (Employee salary : repository) {
            if (maxSalary.getSalary() < salary.getSalary()) {
                maxSalary = salary;
            }
        }
        return maxSalary;
    }
    public static int avgSalary(Employee[] repository) {
        return totalSalary(repository) / repository.length;
    }
    public static void printAllNames(Employee[] repository) {
        for (Employee name : repository) {
            System.out.println(name.getFullName());
        }
    }
    public static void main(String[] args) {
        Employee[] repository = new Employee[10];
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

        printAllEmployeesInfo(repository);
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary(repository));
        System.out.println("Работник с минимальной зарплатой: " + employeeWithMinSalary(repository));
        System.out.println("Работник с максимальной зарплатой: " + employeeWithMaxSalary(repository));
        System.out.println("Средняя зарплата: " + avgSalary(repository));
        printAllNames(repository);
    }
}