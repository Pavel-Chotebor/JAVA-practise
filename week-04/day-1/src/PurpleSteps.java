import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {

        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]


        int sizeOfStep = 12;
        Color purple = new Color(148,0,205);

        // Making a steps
        for(int i =0; i<19; i++) {
            graphics.setColor(purple);
            graphics.fillRect(sizeOfStep + (i * sizeOfStep),sizeOfStep + (i * sizeOfStep),sizeOfStep,sizeOfStep);

        // Making a borders
            graphics.setColor(Color.black);
            graphics.drawRect(sizeOfStep + (i * sizeOfStep),sizeOfStep + (i * sizeOfStep),sizeOfStep,sizeOfStep);
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