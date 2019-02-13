package test_Thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* *
 * В этой программе демонстрируется анимация скачущего мяча
 * (aversion 1.34 2015-06-21
 * Oauthor Cay Horstmann
 */
public class MyTestThreads {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * Фрейм с компонентом мяча и кнопками
 */
class BounceFrame extends JFrame {
    private BallComponent comp;
    public static final int STEPS = 2000;
    public static final int DELAY = 1;

    /**
     * Конструирует фрейм с компонентом, отображающим
     * скачущий мяч, а также кнопки S t a r t и C lo s e
     */
    public BounceFrame() {
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", event -> addBall());
        addButton(buttonPanel, "Close", event -> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    /* *
     * Вводит кнопку в контейнер
     * Oparam с Контейнер
     * @param title Надпись на кнопке
     * Oparam listener Приемник действий кнопки
     */
    public void addButton(Container c, String title,
                          ActionListener listener) {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    /**
     * Вводит скачущий мяч на панели и производит 1000 его отскоков
     */
    public void addBall() {
        try {
            Ball ball = new Ball();
            comp.add(ball);
            for (int i = 1; i <= STEPS; i++) {
                ball.move(comp.getBounds());
                comp.paint(comp.getGraphics());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
        }
    }

//    class BallRunnable implements Runnable{
//        private Ball ball;
//        private Component component;
//
//}

}