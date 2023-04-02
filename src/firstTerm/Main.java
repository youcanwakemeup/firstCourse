package firstTerm;

public class Main {
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
        int totalSalary = 0;
        Employee minSalary = repository[0];
        Employee maxSalary = repository[0];
        for (Employee element : repository) {
            System.out.println(element.toString());
        }
        for (Employee salary : repository) {
            totalSalary += salary.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary);
        for (Employee employee : repository) {
            if (minSalary.getSalary() > employee.getSalary()) {
                minSalary = employee;
            }
        }
        System.out.println("Работник с наименьшей зарплатой: " + minSalary);
        for (Employee employee : repository) {
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println("Работник с наибольшей зарплатой: " + maxSalary);
        System.out.println("Средняя зарплата: " + totalSalary/repository.length);
        for (Employee employee : repository) {
            System.out.println(employee.getFullName());
        }
    }
}