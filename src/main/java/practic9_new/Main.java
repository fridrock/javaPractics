package practic9_new;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        var main = new Main();
        System.out.println(main.solution(number, 0));
    }
    public int solution(int number, int current){
        if(number<10){
            current+=number;
            return current;
        }else{
            current+=number%10;
            current*=10;
            number/=10;
            return solution(number, current);
        }
    }
}
