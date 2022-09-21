public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Engin";
        String ogrenci2 = "Ali";
        String ogrenci3 = "Leyligül";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("******************************************************");

        String[] ogrenciler =new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Ali";
        ogrenciler[2] = "Leyligül";

        for(int i = 0 ; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("******************************************************");
        for(String ogrenci: ogrenciler){
           System.out.println(ogrenci);
        }
    }
}