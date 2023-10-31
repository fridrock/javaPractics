package practic16_new;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        var test = new Second();
        test.exceptionDemo();
    }
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.println( "Enter an integer");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        //<-------------------1------------------>
        //Выбрасывается исключение связанное с тем что строку QWERTY нельзя преобразоывать к типу Integer
        //Класс исключения NumberFormatException
        //<-------------------2------------------>
        //Выбрасывается ArithmeticException тк мы делим 2 на 0
        //<-------------------3------------------>
        //Выбрасывается исключение связанное с тем что число с плавающей запятой нельзя преобразоывать к типу Integer
        //Класс исключения NumberFormatException
        System.out.println(2/i);
    }
    public void exceptionDemo2(){
        var scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = scanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }catch(NumberFormatException e){
            System.out.println("Неправильный формат числа");
        }catch(ArithmeticException e){
            System.out.println("Ошибка при делении на 0");
        }
    }
}
