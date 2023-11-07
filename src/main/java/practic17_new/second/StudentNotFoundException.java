package practic17_new.second;

public class StudentNotFoundException extends Exception {
    private double ball;
    public StudentNotFoundException(double ball){
        this.ball = ball;
    }
    @Override
    public String getMessage(){
        return "Нет студента с баллом:"+this.ball;
    }
}
