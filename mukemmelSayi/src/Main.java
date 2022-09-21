public class Main {
    public static void main(String[] args) {

        // 6 -->1,2,3
        //20 -->1,2,4,14
        int number  = 42;
        int total = 0 ;

        for(int i=1;i<number;i++) {
            if(number % i == 0) {
                total = total+i;
            }
        }

        if(total == number) {
            System.out.println("Mükemmel sayıdır.");
        }else {
            System.out.println("Mükemmel sayi değildir!");
        }

    }
}