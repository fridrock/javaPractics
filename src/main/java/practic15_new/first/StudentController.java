package practic15_new.first;

public class StudentController {
    private Student student;
    private StudentView studentView;
    public StudentController(){
        this.student = new Student();
        this.studentView = new StudentView();
    }
    public void updateView(){
        studentView.printStudentDetails(student.getName(), student.getScore());
    }
    public void setStudentName(String name){
        this.student.setName(name);
    }
    public void setStudentScore(int score){
        this.student.setScore(score);
    }
    public String getStudentName(){
        return this.student.getName();
    }
    public int getStudentScore(){
        return this.student.getScore();
    }
}
