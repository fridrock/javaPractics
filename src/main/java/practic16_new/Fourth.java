package practic16_new;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        var test = new Fourth();
        test.exceptionDemo();
    }
    public void exceptionDemo(){
        var scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = scanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }
        catch(NumberFormatException e){
            System.out.println("Неправильный формат числа");
        }catch(ArithmeticException e){
            System.out.println("Ошибка при делении на 0");
        }catch (Exception e){
            System.out.println("Ошибка во время выполнения");
        }finally{
            System.out.println("Выведется в любом случае");
        }

    }
}
