package practic15_new.second;

public class Employee {
    private Long id;
    private String name;
    private Integer salary;
    private Integer hoursWorked;

    public Employee(Long id, String name, Integer salary, Integer hoursWorked) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
