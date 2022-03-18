import java.util.Scanner;

class less9 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");
        double a = input.nextDouble();

        if (a > 0) {
            if (a < 1) {
                System.out.println("Є маленьке позитивним числом");
            } else if (a > 1000000) {
                System.out.println("Є великим позитивним числом");
            } else {
                System.out.println("Є позитивним числом");
            }
        } else if (a < 0) {


            if (Math.abs(a) < 1) {
                System.out.println("Є маленьке негативним числом");
            } else if (a > 1000000) {
                System.out.println("Є велике негативним числом");
            } else {
                System.out.println("Є негативним числом");
            }
        }
        else {
            System.out.println("Є 0");
        }
    }
}
