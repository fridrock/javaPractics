package practic17_new.second;

public class Student {
    private String name;
    private double ball;

    public Student(String name, double ball) {
        this.name = name;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }
    public double getBall() {
        return ball;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ball=" + ball +
                '}';
    }
}
