import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {

        // Fill the canvas with a checkerboard pattern.

        // Variable defining:
        int sizeOfSquare = 20;
        int rows = (WIDTH / sizeOfSquare);
        int columns = (HEIGHT / sizeOfSquare);

        // Making a rows and columns:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

        // Making a statement which color we use and why:
                if ((i%2 == 0 && j%2 == 0) || (i%2 == 1 && j%2 == 1))
                graphics.setColor(Color.black);
                else
                graphics.setColor(Color.white);

        // Making a checker board:
                graphics.fillRect((i * sizeOfSquare), (j * sizeOfSquare), sizeOfSquare, sizeOfSquare);
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