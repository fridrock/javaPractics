package lab2;

import lab2.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1,2);
        System.out.println(ball);
        ball.move(3,4);
        System.out.println(ball);
        System.out.println(ball.getX());
        ball.setXY(5,5);
        System.out.println(ball);
    }
}
