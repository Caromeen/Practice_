import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        int n;

        System.out.println("Введите размерность пирамиды");
        n = enter.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
