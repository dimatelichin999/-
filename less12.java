import java.util.Scanner;

class less12 {


        public static void main(String args[]) {

            Scanner input = new Scanner(System.in);

            int number_Of_DaysInMonth = 0;
            String MonthOfName = "Unknown";

            System.out.println("Введіть номер місяця");
            int a = input.nextInt();

            System.out.println("Введіть рік");
            int year = input.nextInt();


            switch (a) {

                case 1:
                    MonthOfName = "Січень";
                    number_Of_DaysInMonth=31;
                    break;

                case 2:
                    MonthOfName = "Лютий";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        number_Of_DaysInMonth = 29;
                    } else {
                        number_Of_DaysInMonth = 28;
                    }
                    break;

                case 3:
                    MonthOfName = "Березень";
                    number_Of_DaysInMonth=31;
                    break;

                case 4:
                    MonthOfName = "Квітень";
                    number_Of_DaysInMonth=30;
                    break;

                case 5:
                    MonthOfName = "Травень";
                    number_Of_DaysInMonth=31;
                    break;

                case 6:
                    MonthOfName = "Червень";
                    number_Of_DaysInMonth=30;
                    break;

                case 7:
                    MonthOfName = "Липень";
                    number_Of_DaysInMonth=31;
                    break;

                case 8:
                    MonthOfName = "Серпень";
                    number_Of_DaysInMonth=31;
                    break;

                case 9:
                    MonthOfName = "Вересень";
                    number_Of_DaysInMonth=30;
                    break;

                case 10:
                    MonthOfName = "Жовтень";
                    number_Of_DaysInMonth=31;
                    break;

                case 11:
                    MonthOfName = "Листопад";
                    number_Of_DaysInMonth=30;
                    break;

                case 12:
                    MonthOfName = "Грудень";
                    number_Of_DaysInMonth=31;
                    break;


                default:
                    System.out.println("Немає такого місяця");
            }

            System.out.println(MonthOfName + "" + year + "має" + number_Of_DaysInMonth);
        }
    }

