package practic8_new.task1;


import java.awt.*;
import java.util.Random;

class Circle extends Shape
{
    private final int radius;

    public Circle()
    {
        super();
        radius = new Random().nextInt(50);
    }

    @Override
    public void draw(Graphics graph)
    {
        graph.setColor(color);
        graph.fillOval(x, y, radius * 2, radius * 2);
    }
}