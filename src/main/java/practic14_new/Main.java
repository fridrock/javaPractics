package practic14_new;

import practic14_new.BoundedWaitList;
import practic14_new.IWaitList;
import practic14_new.UnfairWaitList;
import practic14_new.WaitList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("<------------------WAITLIST TEST--------------->");
        IWaitList<Integer> waitList = new WaitList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 8));
        waitList.add(4);
        System.out.println(waitList);
        waitList.remove();
        List<Integer> isInWaitListCollection = new ArrayList<>(Arrays.asList(9, 3));
        System.out.println(waitList.contains(19));
        System.out.println(waitList.containsAll(isInWaitListCollection) );
        System.out.println(waitList.isEmpty());
        System.out.println(waitList);
        System.out.println();
        System.out.println("<------------------BOUNDEDWAITLIST TEST--------------->");
        waitList = new BoundedWaitList<>(1);
        waitList.add(1);
        waitList.add(2);
        System.out.println(waitList.contains(1));
        System.out.println(waitList);
        System.out.println();
        System.out.println("<------------------UNFAIRWAITLIST TEST--------------->");
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        unfairWaitList.add(4);
        System.out.println(unfairWaitList);
        unfairWaitList.remove(1);
        System.out.println(unfairWaitList);
        unfairWaitList.remove();
        System.out.println(unfairWaitList);
        unfairWaitList.remove(4);
        System.out.println(unfairWaitList.containsAll(Arrays.asList(2, 3)));
        unfairWaitList.moveToBack();
        System.out.println(unfairWaitList);
    }
}
