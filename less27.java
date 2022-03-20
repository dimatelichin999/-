import java.util.Scanner;

class less27 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть число:");
        int x = input.nextInt();

        if (x<1){
            System.out.println("Число є негативним");
        }
        else if (x>1){
            System.out.println("Число є позитивним");
        }
        else {
            System.out.println("Число є 0");
        }
    }
}
