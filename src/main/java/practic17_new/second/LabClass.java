package practic17_new.second;

import practic17_new.first.NoSuchUserException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LabClass {
    private List<Student> studentsList;
    public LabClass(){
        this.studentsList = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.studentsList.add(student);
        this.sortStudents();
    }
    private void sortStudents(){
        this.studentsList.sort((Student o1,Student o2)-> Double.compare(o1.getBall(), o2.getBall()));
    }
    public void printStudents(){
        this.studentsList.forEach(System.out::println);
    }
    public Student findStudent(double ball) throws StudentNotFoundException {
        int l = 0, r = this.studentsList.size();
        int mid = (l+r);
        while(r-l>1){
            mid = (l+r)/2;
            if(this.studentsList.get(mid).getBall()<=ball){
                l = mid;
            }else{
                r = mid;
            }
        }
        if(this.studentsList.get(l).getBall()==ball){
            return this.studentsList.get(l);
        }else{
            throw new StudentNotFoundException(ball);
        }
    }
}
