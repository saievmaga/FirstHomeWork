import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessNum();
    }

    public static void guessNum() {
        Scanner sc = new Scanner(System.in);
        int operation, range = 10;
        int number = (int) (Math.random() * range);
        System.out.print("Угадай число от 0 до 9: ");
        for (int i = 0; i <= 3; i++) {
            int in_num = sc.nextInt();
            if (in_num == number) {
                System.out.print("Вы угадали! \n");
                break;
            } else if (in_num > number) {
                System.out.println("Загаданное число меньше " + in_num);
            } else {
                System.out.println("Загаданное число больше " + in_num);
            }
            System.out.println();
        }

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        operation = sc.nextInt();
        if (operation == 1) {
            guessNum();
        } else {
            System.out.println("Спасибо за игру!");
        }
    }
}
