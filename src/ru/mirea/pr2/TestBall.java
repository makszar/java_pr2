package ru.mirea.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100, 100);
        System.out.println(ball);
        ball.move(30, 15);
        System.out.println(ball);
        ball.setX(1);
        ball.setY(2);
        System.out.println(ball.getX() + ", " + ball.getY());
        ball.setXY(10, 20);
        ball.setXYSpeed(2, 3);
        ball.move();
        System.out.println(ball);
        System.out.println(new Ball());
    }
}
