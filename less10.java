import java.util.Scanner;

class less10 {

        public static void main(String args[]) {

            Scanner input = new Scanner(System.in);

            System.out.println("Введіть число:");
            int x= input.nextInt();


            switch (x) {

                case 1:
                    System.out.println("Понеділок");
                    break;

                case 2:
                    System.out.println("Вівторок");
                    x++;
                    break;

                case 3:
                    System.out.println("Середа");
                    break;

                case 4:
                    System.out.println("Четверг");
                    break;

                case 5:
                    System.out.println("Пятниця" );
                    x++;
                    break;

                case 6:
                    System.out.println("Субота");
                    break;

                case 7:
                    System.out.println("Неділя");
                    break;
                default:
                    System.out.println("Не є днем тижня");
            }

        }
    }

