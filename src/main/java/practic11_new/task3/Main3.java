package practic11_new.task3;

import java.util.ArrayList;
import java.util.List;
import practic11_new.task2.Student;
public class Main3
{
    public static void main(String[] args)
    {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Анна", 27));
        list1.add(new Student("Иван", 15));
        list1.add(new Student("Мария", 40));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Петр", 30));
        list2.add(new Student("Елена", 10));
        list2.add(new Student("Алексей", 28));

        for (Student student : list1)
        {
            System.out.print(student.GPA + " ");
            System.out.println(student.name+" ");
        }
        for (Student student : list2)
        {
            System.out.print(student.GPA + " ");
            System.out.println(student.name+" ");
        }

        mergeSort(list1);
        mergeSort(list2);

        List<Student> mergedList = mergeLists(list1, list2);

        System.out.println();
        for (Student student : mergedList)
        {
            System.out.print(student.GPA + " ");
            System.out.println(student.name+" ");
        }
    }

    public static void mergeSort(List<Student> list)
    {
        if (list.size() > 1)
        {
            int mid = list.size() / 2;
            List<Student> left = new ArrayList<>(list.subList(0, mid));
            List<Student> right = new ArrayList<>(list.subList(mid, list.size()));

            mergeSort(left);
            mergeSort(right);

            merge(list, left, right);
        }
    }

    public static void merge(List<Student> list, List<Student> left, List<Student> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size())
        {
            if (left.get(i).GPA < right.get(j).GPA)
            {
                list.set(k++, left.get(i++));
            }
            else
            {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size())
        {
            list.set(k++, left.get(i++));
        }

        while (j < right.size())
        {
            list.set(k++, right.get(j++));
        }
    }

    public static List<Student> mergeLists(List<Student> list1, List<Student> list2)
    {
        List<Student> mergedList = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size())
        {
            if (list1.get(i).GPA < list2.get(j).GPA)
            {
                mergedList.add(list1.get(i++));
            }
            else
            {
                mergedList.add(list2.get(j++));
            }
        }

        while (i < list1.size())
        {
            mergedList.add(list1.get(i++));
        }

        while (j < list2.size())
        {
            mergedList.add(list2.get(j++));
        }

        return mergedList;
    }
}