import java.util.Scanner;

public class less13 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть рік:");
        int year = input.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Рік є високосним");
        } else {
            System.out.println("Рік є невисокосним");
        }
    }
}

