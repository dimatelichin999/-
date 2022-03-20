import java.util.Scanner;

class less28 {



    public static void main(String args[]){

        Scanner input = new Scanner(System.in);



        System.out.println("Введіть число:");
        int x = input.nextInt();

        if(x > 0) {

            if (x < 1) {
                System.out.println("Позитивне маленьке число");
            } else if (x > 100000) {
                System.out.println("Позитивне велике число");
            } else {
                System.out.println("Позитивне  число");
            }
        }
            else if (x < 0 ){
                if (Math.abs(x)<1){
                    System.out.println("Негативне маленьке число");
                }
                else if (Math.abs(x) > 100000){
                    System.out.println("Негативне велике число");
                }
                else {
                    System.out.println("Негативне число");
                }
            }
            else {




                System.out.println("0");
        }
         }
}



