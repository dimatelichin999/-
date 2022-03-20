import java.util.Scanner;

class less20 {

    public static void main(String args[]) {

        int i, j, n;

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i ; j++);
            System.out.print(j);
            System.out.println("");

        }
    }
}
