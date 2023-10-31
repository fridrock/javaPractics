package practic8_new.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageShower extends JFrame
{
    private final BufferedImage image;

    public ImageShower(String imagePath) throws IOException
    {
        image = ImageIO.read(new File(imagePath));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(image.getWidth(), image.getHeight());
        setVisible(true);
    }

    @Override
    public void paint(Graphics graph)
    {
        super.paint(graph);
        graph.drawImage(image, 0, 0, this);
    }
}