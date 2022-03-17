import java.util.Scanner;

public class less3 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");
        int a = input.nextInt();

        if (a>0) {
            System.out.println("Число є позитивним.");
        }
    }
}
