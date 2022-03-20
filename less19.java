import java.util.Scanner;

class less19 {

    public static void main(String args[]) {

        int i,n,sum=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");
        n = input.nextInt();

        for(i = 1 ; i <= n; i++){

            System.out.println(2*i-1);
            sum += 2*i-1;

        }
System.out.println("Сума непарних " + "чисел :" + sum );
    }
}