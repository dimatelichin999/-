import java.util.Scanner;

class less16 {

    public static void main(String args[]){

        int i, n , sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");
        n = input.nextInt();

        for (i = 1 ; i <= n ; i++){
            System.out.println(i);
            sum += i;

        }
        int x = sum / n;
        System.out.println("Сума натуральних чисел" + n + "дорівнює:" + sum + "Середнє значення:" + x  );

    }
}
