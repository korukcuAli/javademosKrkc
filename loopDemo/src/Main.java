public class Main {
    public static void main(String[] args) {

        //For
        for(int i = 1; i <20; i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        for(int j = 2; j <=20; j+=2){
            System.out.println(j);
        }
        System.out.println("Çift Sayı For Döngüsü bitti");

        for(int k = 1; k <20; k+=2){
            System.out.println(k);
        }
        System.out.println("Tek Sayı For Döngüsü bitti");

        //While
        int i = 1;
        while (i< 20){
            System.out.println(i);
            i ++;
        }
        System.out.println("While Döngüsü bitti");

        //Do-While
        int j=1;
        do{
            System.out.println(i);
            j ++;
        }while (j< 20);
        System.out.println("Do-While Döngüsü bitti");

    }
}