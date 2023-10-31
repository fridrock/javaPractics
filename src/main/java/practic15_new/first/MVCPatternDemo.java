package practic15_new.first;

import java.util.Scanner;

public class MVCPatternDemo {
    private StudentController controller;
    public MVCPatternDemo(){
        this.controller = new StudentController();
    }
    public static void main(String[] args) {
        var test = new MVCPatternDemo();
        test.router();
    }
    private void router(){
        System.out.println("/setName - установка имени, /setScore - установка балла, /getInfo - получить информацию");
        System.out.println("/logout - закончить работу");
        String input;
        var scanner = new Scanner(System.in);
        while(!(input=scanner.nextLine()).equals("/logout")){
            switch(input){
                case "/setName":
                    sendStudentName();
                    break;
                case "/setScore":
                    sendStudentScore();
                    break;
                case "/getInfo":
                    retrieveStudentDataFromDatabase();
                    break;
                default:
                    System.out.println("Ошибка 404");
                    break;
            }
        }
    }
    private void retrieveStudentDataFromDatabase(){
        this.controller.updateView();
    }
    private void sendStudentName(){
        System.out.println("Введите имя студента");
        var scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        this.controller.setStudentName(name);
    }
    private void sendStudentScore(){
        System.out.println("Введите балл студента");
        var scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        this.controller.setStudentScore(score);
    }
}
