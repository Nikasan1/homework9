import java.util.Random;
import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNumber = random.nextInt(11); // Якщо в завданні від 0 до 10 включно
        System.out.println(hiddenNumber);  // Загадане число
        Scanner scanner = new Scanner(System.in);
        for (int attempt = 1; attempt < 4; attempt++) {
            System.out.println("Введіть число від 0 до 10. Спроба " + attempt);
            int number = scanner.nextInt();
            if (number == hiddenNumber) {
                System.out.println("Вітаю ви перемогли! Загадане число було: " + hiddenNumber);
                break;
            } else if (attempt == 3) {
                System.out.println("Нажаль Вам не вдалось вгадати число, спробуйте зіграти ще раз!");
            } else {
                System.out.println("Невірно, спробуйте ще раз!");
            }
        }
    }
}
