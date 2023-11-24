package practic19_new;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Object> objects;
    public static void main(String[] args) {
        List<Object> someObjects = new ArrayList<>();
        someObjects.add(new Class1());
        someObjects.add(new Class2());
        someObjects.add(new Class3());
        var test = new Main(someObjects);
        test.printArray(someObjects);
        Class1 cl1 = (Class1)test.getObjectOnIndex(0);
        Class2 cl2 = (Class2)test.getObjectOnIndex(1);
        Class3 cl3 = (Class3)test.getObjectOnIndex(2);
    }
    public Main(List<Object> objects){
        this.objects = objects;
    }
    public Object getObjectOnIndex(int index){
        return this.objects.get(index);
    }
    public void printArray(List<? extends Object> objects){
        for(Object o : objects){
            System.out.println(o);
        }
    }

}
