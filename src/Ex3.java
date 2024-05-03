import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;
        do {
            System.out.print("Введите число (0 для завершения): ");
            number = input.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("Сумма последовательности: " + sum);
    }
}
