package practic15_new.second;

import java.util.List;
import java.util.Scanner;

public class EmployeeConsoleView implements EmployeeView{
    @Override
    public void updateView(List<Employee> employeeList) {
        employeeList.forEach((employee -> {
            System.out.println("Информация о сотруднике");
            System.out.println("id:"+employee.getId());
            System.out.println("Имя сотрудника:"+employee.getName());
            System.out.println("Зарплата за месяц:"+employee.getHoursWorked()*employee.getSalary());
            System.out.println();
        }));
    }

    @Override
    public long getRemoveId() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите id сотрудника, которого нужно удалить");
        int removeId = scanner.nextInt();
        return removeId;
    }
    @Override
    public Employee getAddEmployee(){
        var scanner = new Scanner(System.in);
        System.out.println("Введите новое имя");
        String newName = scanner.nextLine();
        System.out.println("Введите количество часов");
        int newHours = scanner.nextInt();
        ProfessionSalary salary = ProfessionSalary.randomProfession();
        return new Employee(null, newName, newHours, salary.salaryPerHour);
    }
    @Override
    public Employee getUpdatedEmployee() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя");
        long updateId = scanner.nextLong();
        System.out.println("Введите новое имя");
        scanner.nextLine();
        String newName = scanner.nextLine();
        System.out.println("Введите количество часов");
        int newHours = scanner.nextInt();
        ProfessionSalary salary = ProfessionSalary.randomProfession();
        return new Employee(updateId, newName, newHours, salary.salaryPerHour);
    }
}
