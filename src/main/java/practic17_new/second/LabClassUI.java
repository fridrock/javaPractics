package practic17_new.second;

import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI() {
        this.labClass = new LabClass();
        this.scanner = new Scanner(System.in);
        this.manageCommands();
    }

    private void manageCommands(){
        System.out.println("Доступны команды:add, find, print");
        System.out.println("Чтобы закончить выполнение программы напишите exit");
        String command = askCommand();
        while(!command.equals("exit")){
            switch(command){
                case "add":
                    labClass.addStudent(createStudent());
                    break;
                case "print":
                    System.out.println("Список студентов");
                    labClass.printStudents();
                    break;
                case "find":
                    findStudent();
                    break;
            }
            command = askCommand();
        }
    }
    private String askCommand(){
        System.out.println("Введите команду");
        String command = getString();
        return command;
    }
    private String getString(){
        String res = this.scanner.nextLine();
        try{
            checkString(res);
            return res;
        }catch (EmptyStringException e){
            System.out.println(e.getMessage());
            return getString();
        }
    }
    private void checkString(String str) throws EmptyStringException{
        if(str==null || str.equals(""))
            throw new EmptyStringException();
    }
    private double getDouble(){
        String str = getString();
        try {
            Double result = Double.parseDouble(str);
            return result;
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            return getDouble();
        }
    }
    private Student createStudent(){
        System.out.println("Введите имя пользователя");
        String name = getString();
        Double ball = getDouble();
        return new Student(name, ball);
    }
    private void findStudent(){
        System.out.println("Введите балл студента, которого хотите найти");
        Double ball = getDouble();
        try{
            var student = labClass.findStudent(ball);
            System.out.println(student);
        }catch(StudentNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
