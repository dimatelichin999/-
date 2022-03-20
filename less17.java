import java.util.Scanner;

class less17 {

    public static void main(String args[]){

        int i, x , sum=0, cube=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");

        x = input.nextInt();

        for (i = 1 ; i <= x ; i++){
            System.out.println("Куб  натурального числа"+ i  + "дорівнює:" +(i*i*i)    );


        }


    }
}
