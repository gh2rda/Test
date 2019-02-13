package test_enum;

public class MainEnumTest {

    public static void main(String[] args) {
        //===========enum================================
//
//        GameApp app = new GameApp();
//        app.startGame();
////Level myLevel = Level.EXPERT;
////Level myLevel2 = Level.QQQ;
////Level myLevel3 = Level.Ф123;
////
////        System.out.println(myLevel.ordinal());
////        System.out.println(myLevel2.toString());
////        System.out.println(myLevel3.toString());
////        myLevel2 = Level.valueOf("Ф123");
////
////        System.out.println(myLevel2.name());
////
////        System.out.println(myLevel2==myLevel3? " равны ":"не равны");
////        System.out.println(Level.values()[0]);
//
//    }
//
//    enum Level {
//        BEGINNER;
//
//        static {
//            System.out.println("static init block");
//        }
//
//        Level() {
//            System.out.println("constructor");
//        }
//
//        public static void main(String... args) {
//            System.out.println(Level.BEGINNER);
//        }
//    }
////    enum Level {BEGINNER, INTERMEDIATE, EXPERT, QQQ, Ф123}
//
//    static class Game {
//        Level gameLevel;
//    }
//
//    static class GameApp {
//        Game game = null;
//
//        public void startGame() {
//            game = new Game();
//            game.gameLevel = Level.BEGINNER;
//        }
//    }
//
//===========================================

    A aIns = new A();
        System.out.println(aIns.getClass().getName());
    A aIns2 = new B();
        System.out.println(aIns2.getClass().getName());
        B bIns = new B();
        System.out.println(bIns.getClass().getName());
//        B bIns2 =(B) new A();
//        System.out.println(bIns2.getClass().getName());
        aIns.fa=3;
        bIns.fb=4;
        bIns.fa=5;
    aIns=bIns;
        System.out.println(aIns.getClass().getName());
//        bIns=aIns;

    }

    static class A {
        int fa;
    }
    static class B extends A {
        int fb;
    }

}
