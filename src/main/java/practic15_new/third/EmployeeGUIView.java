package practic15_new.third;

import practic15_new.second.Employee;
import practic15_new.second.EmployeeController;
import practic15_new.second.EmployeeView;
import practic15_new.second.ProfessionSalary;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.List;

public class EmployeeGUIView extends JFrame implements EmployeeView {
    private EmployeeController employeeController;
    private JLabel heading;
    private JLabel employeeInfo;
    private JTextField employeeName;
    private JTextField employeeHours;
    private JButton update;
    public EmployeeGUIView(){
        this.employeeController = new EmployeeController(this);
        this.heading = new JLabel();
        this.employeeInfo = new JLabel();
        this.employeeName = new JTextField(20);
        this.employeeName.setSize(100,300);
        this.employeeHours = new JTextField(20);
        this.employeeHours.setSize(100,300);
        this.update = new JButton("Обновить сотрудника");
        this.update.addActionListener((a)->{
            this.employeeController.updateEmployee();
        });
        this.heading.setText("Информация о сотруднике");
        this.employeeController.getEmployeesInfo();
        setSize(800, 400);
        setLayout(new BorderLayout());
        add(heading, BorderLayout.NORTH);
        add(employeeName, BorderLayout.EAST);
        add(employeeHours, BorderLayout.WEST);
        add(employeeInfo, BorderLayout.CENTER);
        add(update, BorderLayout.SOUTH);
    }
    @Override
    public void updateView(List<Employee> employeeList) {
        var e = employeeList.get(0);
        String info = "<html>Id сотрудника:0"+"<br>"+
                "Имя сотрудника:"+e.getName()+"<br>"+
                "Зарплата за месяц:"+e.getSalary()*e.getHoursWorked()+"</html>";
        this.employeeInfo.setText(info);
    }

    @Override
    public long getRemoveId() {
        return 0;
    }

    @Override
    public Employee getAddEmployee() {
        return null;
    }
    @Override
    public Employee getUpdatedEmployee() {
        String name = this.employeeName.getText();
        Integer hours = Integer.parseInt(this.employeeHours.getText());
        var e = new Employee(0L, name, ProfessionSalary.randomProfession().salaryPerHour, hours);
        return e;
    }
}
