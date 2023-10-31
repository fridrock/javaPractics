package practic15_new.second;

import java.util.Scanner;

public class MVCEmployeeTest {
    private EmployeeController controller;
    public static void main(String[] args) {
        var test = new MVCEmployeeTest();
        test.router();
    }
    public MVCEmployeeTest(){
        this.controller = new EmployeeController(new EmployeeConsoleView());
    }
    public void router(){
        var scanner = new Scanner(System.in);
        String input;
        while(!(input=scanner.nextLine()).equals("/logout")){
            switch(input){
                case "/getEmployees":
                    this.controller.getEmployeesInfo();
                    break;
                case "/remove":
                    this.controller.removeEmployee();
                    break;
                case "/update":
                    this.controller.updateEmployee();
                    break;
                case "/add":
                    this.controller.addEmployee();
                    break;
                default:
                    System.out.println("Ошибка 404");
            }
        }
    }
}
