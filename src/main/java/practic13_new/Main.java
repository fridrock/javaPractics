package practic13_new;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final String filePath = "C:\\practic1\\src\\main\\java\\practic13_new\\file.txt";
    private final File file;
    public static void main(String[] args) {
        var test = new Main();
        test.manageTasks();
    }
    public Main(){
        this.file = new File(this.filePath);
    }
    public void manageTasks(){
        System.out.println("Введите номер задания, которое хотите протестировать");
        var scanner = new Scanner(System.in);
        int taskNumber = scanner.nextInt();
        while(taskNumber!=-1){
            switch(taskNumber){
                case 1:
                case 3:
                    writeFile();
                    break;
                case 2:
                    readFromFile();
                    break;
                case 4:
                    appendToFile();
                    break;
                default:
                    System.out.println("Нет задания с таким номером");
            }
            System.out.println("Введите номер задания, которое хотите протестировать");
            taskNumber = scanner.nextInt();
        }

    }
    public void writeFile(){
        System.out.println("Введите информацию, которую нужно записать в файл");
        var scanner = new Scanner(System.in);
        String commandLineInfo = scanner.nextLine();
        try{
            FileWriter writer = new FileWriter(this.file, false);
            writer.write(commandLineInfo);
            writer.append("\n");
            writer.flush();
        }catch(IOException exception){
            System.out.println("Ошибка с открытием FileWriter");
        }
    }
    public void readFromFile(){
        try{
            var reader = new FileReader(this.file);
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }catch(IOException exception){
            System.out.println("Ошибка с созданием FileReader");
        }
    }
    public void appendToFile(){
        System.out.println("Введите информацию, которая допишется в файл");
        var scanner = new Scanner(System.in);
        String commandLineInfo = scanner.nextLine();
        try{
            FileWriter writer = new FileWriter(this.file, true);
            writer.write(commandLineInfo);
            writer.append("\n");
            writer.flush();
        }catch(IOException exception){
            System.out.println("Ошибка с открытием FileWriter");
        }
    }
}
