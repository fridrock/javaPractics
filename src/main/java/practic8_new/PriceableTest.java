package practic8_new;

import java.util.ArrayList;
import java.util.List;

public class PriceableTest {
    public static void main(String[] args) {
        List<Priceable> whatCanBeSold = new ArrayList<>();
        whatCanBeSold.add(new Computer());
        whatCanBeSold.add(new Car());
        whatCanBeSold.add(new Skirt());
        for(int i = 0;i<whatCanBeSold.size();i++){
            System.out.println(whatCanBeSold.get(i));
            System.out.println("It's price is: "+whatCanBeSold.get(i).getPrice());
        }
    }
}
