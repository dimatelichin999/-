import java.util.Scanner;

public class less11 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть 1-e число :");
        int x = input.nextInt();

        System.out.println("Введіть 2-e число :");
        int y = input.nextInt();

         x = Math.round(x * 1000);
         x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y) {

            System.out.println("Вони однакові до трьох знаків після коми");
        }
        else {
            System.out.println("Вони не однакові ");
        }


    }
}