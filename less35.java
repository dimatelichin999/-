 class less35 {

    public static void main(String args[]){

        int x = 1;

        while (x < 10){
            x++;
            if ((x % 7) == 0)
                continue;
            System.out.println(x);

        }
    }
}
