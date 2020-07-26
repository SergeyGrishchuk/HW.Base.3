package HomeWork_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guessTheNumber();
        gameContinue();
    }

    public static int guessTheNumber() {
        System.out.println("Угадайте число от 0 до 9\n" + "У вас 3 попытки. Игра началась!");
        int number = rand.nextInt(10);
        int i = 0;
        for (i = 0; i < 3; i++) playLevel(number, i);
        return number;
    }

    public static int gameContinue() {
        System.out.println("Вы хотите начать игру заново? 1 - ДА, 0 - НЕТ");
        int userAnswer = sc.nextInt();
        if(userAnswer == 1) {
            System.out.println("Еще разочек");
        } else {
            System.out.println("Игра окончена");
            sc.close();
        }
        return guessTheNumber();
    }

    public static int playLevel(int number, int i) {
        int userNumber = sc.nextInt();
        if(userNumber == number){
            System.out.println("Вы выиграли!");
            return gameContinue();
        } else if(userNumber > number) {
            System.out.println("Загаданное число меньше");
        } else {
            System.out.println("Загаданное число больше");
        }
        return i++;
    }
}
