package practic15_new.second;

import java.util.List;

public interface EmployeeView {
    void updateView(List<Employee> employeeList);
    long getRemoveId();
    Employee getAddEmployee();
    Employee getUpdatedEmployee();
}
