import java.util.Scanner;

class less8 {

    public static void main(String args []){

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть 1-е число:");
        double a = input.nextDouble();

        System.out.println("Введіть 2-е число:");
        double b = input.nextDouble();

        System.out.println("Введіть 3-е число:");
        double c = input.nextDouble();


        if (a > b )
            if (a > c)
                System.out.println("Найбільшим числом є :" + a);

        if (b > a )
            if (b > c)
                System.out.println("Найбільшим числом є :" + b);

        if (c > b )
            if (c > a)
                System.out.println("Найбільшим числом є :" + c);
    }
}
