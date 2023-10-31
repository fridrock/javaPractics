package practic15_new.second;

public class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;
    public EmployeeController(EmployeeView view){
        this.model = new EmployeeModel();
        this.view = view;
    }
    public void getEmployeesInfo(){
        this.view.updateView(this.model.getEmployees());
    }
    public void addEmployee(){
        var e = this.view.getAddEmployee();
        this.model.addEmployee(e);
        this.view.updateView(this.model.getEmployees());
    }
    public void updateEmployee(){
        var e = this.view.getUpdatedEmployee();
        this.model.updateEmployee(e);
        this.view.updateView(this.model.getEmployees());
    }
    public void removeEmployee(){
        long id =  this.view.getRemoveId();
        this.model.removeEmployee(id);
        this.view.updateView(this.model.getEmployees());
    }
}
