package test_Thread;


import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * Компонент, рисующий скачущий мяч
 *
 * @version 1.34 2012-01-26
 * eauthor Cay Horstmann
 */
public class BallComponent extends JPanel {
    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 350;
    private java.util.List<Ball> balls = new ArrayList();

    /**
     * Вводит мяч в компонент
     * eparam b Вводимый мяч
     */
    public void add(Ball b) {
        balls.add(b);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // очистить фон
        Graphics2D g2 = (Graphics2D) g;
        for (Ball b : balls) {
            g2.fill(b.getShape());
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

