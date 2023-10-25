package help;

import java.util.*;

public class Help4 {
    public static void main(String[] args) {
        var help = new Help4();
        System.out.println(help.drinkerGame());
    }

    String drinkerGame(){
        Scanner scanner = new Scanner(System.in);
        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();
        //ubirayu probeli iz stroki
        firstRow = firstRow.replaceAll("\\s", "");
        secondRow = secondRow.replaceAll("\\s", "");
        //sozdau list (colodu)
        Deque<Integer> firstCards = new ArrayDeque<>();
        Deque<Integer> secondCards = new ArrayDeque<>();
        //добавляю стартовые карты из строки в лист
        for(int i = 0;i<5;i++) {
            firstCards.add(Character.getNumericValue(firstRow.charAt(i)));
            secondCards.add(Character.getNumericValue(secondRow.charAt(i)));
        }
        int steps = 0;
        while(firstCards.size()!=0 && secondCards.size()!=0){
            Integer firstCard = firstCards.pollFirst();
            Integer secondCard = secondCards.pollFirst();
            System.out.println(firstCard+" "+secondCard);
            int result = whoWins(firstCard, secondCard);
            switch(result){
                case 0:
                    firstCards.add(firstCard);
                    firstCards.add(secondCard);
                    break;
                case 1:
                    secondCards.add(firstCard);
                    secondCards.add(secondCard);
                    break;
                default:
                    System.out.println("Неправильное значение карт, карты должны быть с уникальным номиналом");
            }
            steps++;
            if(steps==106){
                return "botva";
            }
        }
        //это if в одну строчку, сначала условие, потом знак вопроса за ним, после знака вопроса результат если
        // тру, если фолс то результат после :
        String winner = firstCards.size()>secondCards.size()?"first":"second";
        return winner+" "+steps;
    }

    //return 0 - a wins, return 1 - b wins, return -1 - draw
    int whoWins(int a, int b) {
        if(a>b){
            if(a==9 && b==0)
                return 1;
            return 0;
        }
        else if(a<b){
            if(b==9 && a==0)
                return 0;
            return 1;
        }else{
            return -1;
        }
    }

}
