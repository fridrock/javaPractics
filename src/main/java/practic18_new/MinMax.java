package practic18_new;

public class MinMax<E extends Comparable<E>> {
    public E[] arr;
    private E min;
    private E max;
    public MinMax(E[] arr) {
        this.arr = arr;
        if (arr.length > 0) {
            min = arr[0];
            max = arr[0];
        }
        for (int i=0; i<arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];
            }
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        }
    }

    public E getMin() {
        return min;
    }

    public E getMax() {
        return max;
    }
}
