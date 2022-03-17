import java.util.Scanner;

public class less4 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть 1-е число:");
        int a = input.nextInt();

        System.out.println("Введіть 2-е число:");
        int b = input.nextInt();

        System.out.println("Введіть 3-е число:");
        int c = input.nextInt();

        if (a>b && a>c) {
            System.out.println("X більше Y , і більше від С" );
        }

    }
}

