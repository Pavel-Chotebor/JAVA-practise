import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {

        int coefficient = 32;

        for (int i = 0; i < 10; i++) {


            // From left side
             graphics.drawLine( ( i * coefficient), HEIGHT, ( (WIDTH/2) + (i*coefficient) / 2 ), (i * coefficient) );


            // from right side
            graphics.drawLine( ( WIDTH/2 - (i * coefficient) / 2 ), ( i * coefficient), (WIDTH - ( i * coefficient) ), HEIGHT );


            // from bottom
            graphics.drawLine((i*coefficient) / 2, ( HEIGHT - ( i * coefficient) ), ( WIDTH - (i*coefficient) / 2 ), (HEIGHT - ( i * coefficient)) );

           

        }

    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}