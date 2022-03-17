import java.util.Scanner;

class less6 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть 1-е число:");
        int a = input.nextInt();

        System.out.println("Введіть 2-е число:");
        int b = input.nextInt();

        int z = (a>b)? (a+b) : (a*b);

        System.out.println("Результатом є : " + z);
    }
}
