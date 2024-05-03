import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите числа a и b: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Сумма чисел равна " + sum(a, b));
    }
    public static int sum(int a, int b) {
        if (a == 0) {
            return b;
        }
        return sum(a - 1, b + 1);
    }
}
