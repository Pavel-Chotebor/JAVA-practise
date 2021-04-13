import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){

            for (int i = 0; i <10 ; i++ ) {


                graphics.setColor(Color.green);

                //prava horni
               graphics.drawLine((WIDTH/2) , (i * 16), (WIDTH/2) + (i*16), (HEIGHT/2) );


                //prava dolni
                graphics.drawLine((WIDTH/2) , HEIGHT - (i*16), (WIDTH/2) + (i*16), (HEIGHT/2) );

               //leva horni//

                if (i > 0) {
                    graphics.drawLine((i * 16), HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) - (i * 16) );
                }
               //levá dolni
                if (i > 0) {
                graphics.drawLine((i * 16), HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) + (i * 16) );
                }

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