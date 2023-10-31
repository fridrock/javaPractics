package practic8_new.task3;

import javax.imageio.ImageIO;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.image.BufferedImage;
        import java.io.File;
        import java.io.IOException;

public class GIF extends JFrame
{
    private final BufferedImage[] images;
    private int currentImage = 0;

    public GIF() throws IOException
    {
        this.images = new BufferedImage[] {
                loadImage("C:\\practic1\\src\\main\\java\\practic8_new\\task3\\1.jpg"),
                loadImage("C:\\practic1\\src\\main\\java\\practic8_new\\task3\\2.jpg"),
                loadImage("C:\\practic1\\src\\main\\java\\practic8_new\\task3\\3.jpg")
        };

        Timer timer = new Timer(3000, listener -> {
            if(currentImage<=images.length-1) {
                repaint();
                currentImage++;
            }else{
                currentImage = 0;
            }
        });
        timer.start();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setVisible(true);
    }

    @Override
    public void paint(Graphics graph)
    {
        super.paint(graph);
        graph.drawImage(images[currentImage], 0, 0, this);
    }

    private BufferedImage loadImage(String imagePath) throws IOException
    {
        return ImageIO.read(new File(imagePath));
    }
}
