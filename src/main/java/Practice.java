import java.util.Random;
import java.util.Scanner;

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
//public class Practice {
//    public static void main(String[] args) {
//        byte number = 5;
//        short letters = 26;
//        int apartments = 48;
//        long userNameData = 100000L;
//        float myCash = 31.7f;
//        double myMoney = 31560.70;
//        boolean statusOnline = true;
//        char mathOperation = 'x';
//        String color;
//
//
//        outExpression(1.0f, 5.6f, 9.8f, 87.985f);
//        outNumbers(apartments, 6);
//        outConsole(5);
//        outOperation(-10);
//        SendHello("Maga");
//        yearHappy(400);
//    }
//
//    static double outExpression(float a, float b, float c, float d) {
//        return (a * (b + (c / d)));
//    }
//
//    static boolean outNumbers(int a, int b) {
//        int sum = a + b;
//        if (sum >= 10 && sum <= 20) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    static void outConsole(int a) {
//        if (a >= 0) {
//            System.out.println("Число" + a + "положительное");
//        } else {
//            System.out.println("Число" + a + "отрицательное");
//        }
//    }
//
//    static boolean outOperation(int a) {
//        if (a < 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    static void SendHello(String a) {
//        System.out.println("Привет," + a + "!");
//    }
//
//    /*8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
//    static void yearHappy(int year)  {
//        if (year % 400 == 0) {
//            System.out.println("god visakosnyi");
//        } else if (year % 100 == 0) {
//            System.out.println("ne visokosnyi");
//        } else if (year % 4 == 0) {
//            System.out.println("visokosnyi");
//        } else {
//            System.out.println("ne visokosnyi");
//        }
//    } //логические задачи для начинающих программистов
//}
//    public static void guessNum() {
//        Scanner sc = new Scanner(System.in);
//        int operation, range = 10;
//        int number = (int) (Math.random() * range);
//        System.out.print("Угадай число от 0 до 9: ");
//        for (int i = 0; i <= 3; i++) {
//            int in_num = sc.nextInt();
//            if (in_num == number) {
//                System.out.print("Вы угадали! \n");
//                break;
//            } else if (in_num > number) {
//                System.out.println("\n" + "Загаданное число меньше " + in_num);
//            } else {
//                System.out.println("\n" + "Загаданное число больше " + in_num);
//            }
//        }
//        System.out.print("\n" + "-----------------------------");
//        System.out.print("Повторить игру еще раз? 1 – да | 0 – нет " + "Выберите вариант: ");
//        operation = sc.nextInt();
//        if (operation == 1) {
//            guessNum();
//        } else {
//            System.out.println("Спасибо за игру!");
//        }
//    }

//import java.util.Random;
//        import java.util.Scanner;
//
//public class Main {
//
//    private static char[][] gameMap;
//    public static Scanner sc = new Scanner(System.in);
//
//    private static final char EMPTY_DOT = '•';
//    private static final char X_DOT = 'X';
//    private static final char O_DOT = '0';
//
//
//    public static void main(String[] args) {
//
//        startGame();
//    }
//
//
//    private static void startGame() {
//        initGameMap(5, 5);
//        paintGameMap();
//        int count = 0;
//
//        while (true) {
//            humanTurn();
//            count++;
//            paintGameMap();
//            if (checkWin(X_DOT)) {
//                System.out.println("Вы выиграли!");
//                break;
//            }
//            if (count == gameMap.length * gameMap[0].length) {
//                System.out.println("Ничья!");
//            }
//
//            computeTurn();
//            count++;
//            paintGameMap();
//            if (checkWin(O_DOT)) {
//                System.out.println("Вы проиграли, компьютер выиграл!!!");
//            }
//
//            if (count == gameMap.length * gameMap[0].length) {
//                System.out.println("Ничья!");
//                break;
//            }
//        }
//    }
//
//
//    private static boolean checkWin(char c) {
//
//        int diag1, diag2, hor, ver;
//        for (int i = 0; i < gameMap.length; i++) {
//            hor = 1;
//            ver = 1;
//            for (int j = 0; j < gameMap.length; j++) {
//                if (gameMap[i][j] == c) {
//                    hor++;
//                }
//                if (gameMap[j][i] == c) {
//                    ver++;
//                }
//            }
//            if (hor == gameMap.length || ver == gameMap.length) {
//                return true;
//            }
//        }
//        diag1 = 0;
//        diag2 = 0;
//        for (int i = 0; i < gameMap.length; i++) {
//            if (gameMap[i][i] == c) {
//                diag1++;
//            }
//            if (gameMap[i][gameMap.length - i - 1] == c) {
//                diag2++;
//            }
//        }
//        if (diag1 == gameMap.length || diag2 == gameMap.length) {
//            return true;
//        }
//        return false;
//    }
//
//
//    private static void computeTurn() {
//        System.out.println("""
//                ----------------------
//                Компьютер пока что думает!
//                ----------------------""");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ignored) {
//        }
//        int x, y;
//        boolean checkCell;
//        Random random = new Random();
//        do {
//            x = random.nextInt(gameMap.length);
//            y = random.nextInt(gameMap.length);
//            checkCell = isValidCell(x, y);
//        } while (!checkCell);
//        gameMap[x][y] = O_DOT;
//    }
//
//
//    private static void humanTurn() {
//        int x = -1;
//        int y = -1;
//        boolean checkCell;
//        do {
//            System.out.println("Пожалуйста введите координаты в формате X Y: ");
//            if (sc.hasNextInt()) {
//                x = sc.nextInt() - 1;
//            }
//            if (sc.hasNextInt()) {
//                y = sc.nextInt() - 1;
//            }
//            checkCell = isValidCell(x, y);
//            sc.nextLine();
//        } while (!checkCell);
//        gameMap[x][y] = X_DOT;
//    }
//
//
//    private static boolean isValidCell(int x, int y) {
//        if (x < 0 || y < 0 || x > gameMap.length || y > gameMap.length) {
//            return false;
//        }
//        return gameMap[x][y] == EMPTY_DOT;
//    }
//
//
//    private static void paintGameMap() {
//        for (int i = 0; i < gameMap.length; i++) {
//            for (int j = 0; j < gameMap[i].length; j++) {
//                System.out.print(gameMap[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//
//    private static void initGameMap(int length, int width) {
//        if (length < 5 || width < 5) {
//            System.out.println("You stupid man");
//            System.exit(0);
//        }
//        gameMap = new char[length][width];
//        for (int i = 0; i < gameMap.length; i++) {
//            for (int j = 0; j < gameMap[i].length; j++) {
//                gameMap[i][j] = EMPTY_DOT;
//            }
//        }
//    }
//}
