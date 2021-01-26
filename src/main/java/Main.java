import java.util.Random;
import java.util.Scanner;

public class Main {

    private static char[][] gameMap;
    public static Scanner sc = new Scanner(System.in);

    private static final char EMPTY_DOT = '•';
    private static final char X_DOT = 'X';
    private static final char O_DOT = '0';


    public static void main(String[] args) {

        startGame();
    }


    private static void startGame() {
        initGameMap(5, 5);
        paintGameMap();
        int count = 0;

        while (true) {
            humanTurn();
            count++;
            paintGameMap();
            if (checkWin(X_DOT)) {
                System.out.println("Вы выиграли!");
                break;
            }
            if (count == gameMap.length * gameMap[0].length) {
                System.out.println("Ничья!");
            }

            computeTurn();
            count++;
            paintGameMap();
            if (checkWin(O_DOT)) {
                System.out.println("Вы проиграли, компьютер выиграл!!!");
            }

            if (count == gameMap.length * gameMap[0].length) {
                System.out.println("Ничья!");
                break;
            }
        }
    }


    private static boolean checkWin(char c) {

        int diag1, diag2, hor, ver;
        for (int i = 0; i < gameMap.length; i++) {
            hor = 1;
            ver = 1;
            for (int j = 0; j < gameMap.length; j++) {
                if (gameMap[i][j] == c) {
                    hor++;
                }
                if (gameMap[j][i] == c) {
                    ver++;
                }
            }
            if (hor == gameMap.length || ver == gameMap.length) {
                return true;
            }
        }
        diag1 = 0;
        diag2 = 0;
        for (int i = 0; i < gameMap.length; i++) {
            if (gameMap[i][i] == c) {
                diag1++;
            }
            if (gameMap[i][gameMap.length - i - 1] == c) {
                diag2++;
            }
        }
        if (diag1 == gameMap.length || diag2 == gameMap.length) {
            return true;
        }
        return false;
    }


    private static void computeTurn() {
        System.out.println("""
                ----------------------
                Компьютер пока что думает!
                ----------------------""");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        int x, y;
        boolean checkCell;
        Random random = new Random();
        do {
            x = random.nextInt(gameMap.length);
            y = random.nextInt(gameMap.length);
            checkCell = isValidCell(x, y);
        } while (!checkCell);
        gameMap[x][y] = O_DOT;
    }


    private static void humanTurn() {
        int x = -1;
        int y = -1;
        boolean checkCell;
        do {
            System.out.println("Пожалуйста введите координаты в формате X Y: ");
            if (sc.hasNextInt()) {
                x = sc.nextInt() - 1;
            }
            if (sc.hasNextInt()) {
                y = sc.nextInt() - 1;
            }
            checkCell = isValidCell(x, y);
            sc.nextLine();
        } while (!checkCell);
        gameMap[x][y] = X_DOT;
    }


    private static boolean isValidCell(int x, int y) {
        if (x < 0 || y < 0 || x > gameMap.length || y > gameMap.length) {
            return false;
        }
        return gameMap[x][y] == EMPTY_DOT;
    }


    private static void paintGameMap() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[i].length; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void initGameMap(int length, int width) {
        if (length < 5 || width < 5) {
            System.out.println("You stupid man");
            System.exit(0);
        }
        gameMap = new char[length][width];
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[i].length; j++) {
                gameMap[i][j] = EMPTY_DOT;
            }
        }
    }
}
