package practic17_new.first;

import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class First {
    private HashMap<String, Integer> FIOInns;

    public First(){
        this.FIOInns = new HashMap<>();
        this.FIOInns.put("Александр",12);
        this.FIOInns.put("Семен",1);
        this.FIOInns.put("Марк",55);
    }

    public static void main(String[] args) {
        var test = new First();
        test.test();
    }
    public void test(){
        var scanner = new Scanner(System.in);
        System.out.println("Хотите сделать заказ?(да/нет)");
        var userInput = scanner.nextLine();
        while(userInput.equals("да")){
            System.out.println("Введите свое имя");
            var FIO = scanner.nextLine();
            System.out.println("Введите свое ИНН");
            var inn = Integer.parseInt(scanner.nextLine());
            try{
                checkOrder(FIO, inn);
            }catch(NoSuchUserException e){
                System.out.println(e.getMessage());
            }
            catch(WrongINNException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Хотите сделать заказ?(да/нет)");
            userInput = scanner.nextLine();
        }

    }
    public void checkOrder(String FIO, int inn) throws WrongINNException, NoSuchUserException{
        Optional<Integer> userInn = Optional.ofNullable(this.FIOInns.get(FIO));
        if(!userInn.isPresent())
            throw new NoSuchUserException(FIO);
        if(this.FIOInns.get(FIO)!=inn)
            throw new WrongINNException(FIO, inn);
        else
            System.out.println("Заказ принят");
    }
}
