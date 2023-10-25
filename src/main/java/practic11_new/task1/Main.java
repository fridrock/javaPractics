package practic11_new.task1;

public class Main
{
    public static void insertionSort(Student[] students)
    {
        for (int i = 1; i < students.length; i++)
        {
            Student main = students[i];
            int j = i;

            while (j > 0 && students[j - 1].idNumber > main.idNumber)
            {
                students[j] = students[j - 1];
                j -= 1;
            }

            students[j] = main;
        }
    }

    public static void main(String[] args)
    {
        Student[] students = {
                new Student("Alice", 3),
                new Student("Bob", 1),
                new Student("Charlie", 2),
                new Student("David", 4)
        };

        for (Student student : students)
        {
            System.out.print(student.idNumber + " ");
            System.out.println(student.name + " ");
        }

        insertionSort(students);
        System.out.println();

        for (Student student : students)
        {
            System.out.print(student.idNumber + " ");
            System.out.print(student.name+" ");

        }
    }
}
