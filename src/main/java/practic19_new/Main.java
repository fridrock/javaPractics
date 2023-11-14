package practic19_new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IWaitList<Integer> waitList = new WaitList<>(Arrays.asList(1, 2, 3));
        waitList.add(4);
        System.out.println(waitList);
        waitList.remove();
        List<Integer> checkCollection = new ArrayList<>(Arrays.asList(2, 3));
        System.out.println(waitList.contains(10));
        System.out.println(waitList.containsAll(checkCollection) );
        System.out.println(waitList.isEmpty());
        System.out.println(waitList + "\n");

        waitList = new BoundedWaitList<>(3);
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);
        waitList.add(4);
        System.out.println(waitList.contains(10));
        System.out.println(waitList + "\n");

        UnfairWaitList<Integer> waitList1 = new UnfairWaitList<>();
        waitList1.add(1);
        waitList1.add(2);
        waitList1.add(3);
        waitList1.add(4);
        System.out.println(waitList1);
        waitList1.remove();
        System.out.println(waitList1.containsAll(Arrays.asList(2, 3)));
        waitList1.moveToBack();
        System.out.println(waitList1);
    }
}
