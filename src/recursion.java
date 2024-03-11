import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        recursion(0, a);
    }

    private static void recursion(int sum, int num) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        recursion(sum + num, num - 1);
    }
}
