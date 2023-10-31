package practic15_new.second;

import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {
    private static long currentId = 0;
    private List<Employee> employees;
    public EmployeeModel(){
        this.employees = new ArrayList<>();
        var e = new Employee(currentId, "John Doe", ProfessionSalary.BACKEND.salaryPerHour,20);
        employees.add(e);
        currentId++;
    }
    public void addEmployee(Employee e){
        e.setId(currentId);
        currentId++;
        employees.add(e);
    }
    public int findIndexOfEmployee(long id){
        for(int i = 0;i<employees.size();i++){
            if(employees.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    public void removeEmployee(long id){
        int i = findIndexOfEmployee(id);
        employees.remove(i);
    }
    public void updateEmployee(Employee e){
        int i = findIndexOfEmployee(e.getId());
        var employeeFromDb = employees.get(i);
        employeeFromDb.setName(e.getName());
        employeeFromDb.setHoursWorked(e.getHoursWorked());
        employeeFromDb.setSalary(e.getSalary());
    }
    public List<Employee> getEmployees(){
        return employees;
    }
}
