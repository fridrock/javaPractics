package practic8_new.task1;

import practic8_new.task1.Circle;

import javax.swing.*;
import java.awt.*;

public class RandomShapes extends JFrame
{
    private final Shape[] shapes;

    public RandomShapes()
    {
        shapes = new Shape[20];
        for (int i = 0; i < 20; i++)
        {
            shapes[i] = new Circle();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
    }

    @Override
    public void paint(Graphics graph)
    {
        super.paint(graph);
        for (Shape shape : shapes)
        {
            shape.draw(graph);
        }
    }
}
