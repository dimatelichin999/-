import java.util.Scanner;

class less7 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Введіть 1-е число:");
        double a = input.nextDouble();

        System.out.println("Введіть 2-е число:");
        double b = input.nextDouble();

        System.out.println("Введіть 2-е число:");
        double c = input.nextDouble();

        double result = b * b - 4.0 * a * c;
        if (result>0.0){
            double r1 = (-b + Math.pow(result,0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result,0.5)) / (2.0 * a);
            System.out.println("Число є " + r1 + "і" + r2);

        }
        else if (result==0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("Число є " + r1 );

        }
        else {
            System.out.println("Помилка");
        }

    }
}
