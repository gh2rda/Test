package lambda;

import java.util.function.IntConsumer;

public class SL extends Thread {
    public static Integer nnn = new Integer(0);
    public Integer ns = new Integer(111);

    public void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }

    public static void main(String[] args) {
        System.out.println(nnn);
        SL.nnn=13;
        System.out.println(nnn);
        nnn = 12;
        System.out.println(nnn);

        SL slObj = new SL();
        slObj.ns = 111;

        SL t1 = new SL();
        SL t2 = new SL();

        t1.start();
        t2.start();

        t1.repeat(20, i -> System.out.println("Квадраты: " + i * i));
        t1.repeat(20, i -> System.out.println("Кубы: " + i * i * i));
//        t2.repeat(10, () -> System.out.println("By, World!"));

    }
}
