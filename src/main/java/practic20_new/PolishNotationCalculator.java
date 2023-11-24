package practic20_new;

import java.util.Scanner;

public class PolishNotationCalculator {
    public static void main(String[] args) {
        var stack = new Stack(20);
        var scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        int index = 0;
        String current = "";
        while(index<expression.length()){
            char currentChar = expression.charAt(index);
            if(currentChar==' '){
                current = "";
                index++;
                continue;
            }
            current += Character.toString(currentChar);
            try{
                Double number = Double.parseDouble(current);
                stack.push(number);
            }catch(NumberFormatException e){
                Double second = stack.pop();
                Double first = stack.pop();
                switch(current){
                    case "*":
                        stack.push(first*second);
                        break;
                    case "+":
                        stack.push(first+second);
                        break;
                    case "-":
                        stack.push(first-second);
                        break;
                    case "/":
                        stack.push(first/second);
                        break;
                }
            }
            index++;
        }

        System.out.println("Результат:" + stack.peek());
    }
}
