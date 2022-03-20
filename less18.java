import java.util.Scanner;

class less18 {

    public static void main(String args[]){

        int i,n;

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");
        n = input.nextInt();

        for (i = 0 ; i <= n; i++){
            System.out.println("5 *" + i + "=" + i * n);
        }

    }
}
