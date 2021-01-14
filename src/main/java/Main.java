//    byte aByte; //8 битов -128 127
//    short aShort; //16 -32768 32767
//    int anInt; //32
//    long aLong; //64
//
//    private static float aFloat = 0.3f; //32
//    double aDouble; //64
//
//    public static char aChar; //16
//
//    boolean aBoolean;
//
//    String string;pub
public class Main {
    public static void main(String[] args) {
        byte number = 5;
        short letters = 26;
        int apartments = 48;
        long userNameData = 100000L;
        float myCash = 31.7f;
        double myMoney = 31560.70;
        boolean statusOnline = true;
        char mathOperation = 'x';
        String color;


        outExpression(1.0f, 5.6f, 9.8f, 87.985f);
        outNumbers(apartments, 6);
        outConsole(5);
        outOperation(-10);
        SendHello("Maga");
        yearHappy(400);
    }

    static double outExpression(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    static boolean outNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void outConsole(int a) {
        if (a >= 0) {
            System.out.println("Число" + a + "положительное");
        } else {
            System.out.println("Число" + a + "отрицательное");
        }
    }

    static boolean outOperation(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void SendHello(String a) {
        System.out.println("Привет," + a + "!");
    }

    /*8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    static void yearHappy(int year)  {
        if (year % 400 == 0) {
            System.out.println("god visakosnyi");
        } else if (year % 100 == 0) {
            System.out.println("ne visokosnyi");
        } else if (year % 4 == 0) {
            System.out.println("visokosnyi");
        } else {
            System.out.println("ne visokosnyi");
        }
    } //логические задачи для начинающих программистов
}
