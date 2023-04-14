import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        String [] namaKota = {"Makassar" , "Jakarta" , "Medan" , "Manado" , "Surabaya"} ;
        Scanner input = new Scanner (System.in) ;
        System.out.println("Masukkan nama kota yang dicari :");
        String cari = input.nextLine() ;
        input.close() ;

        System.out.println(findIndex(namaKota, cari));
    }
    public static int findIndex (String[] array, String teks) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(teks)) {   // method ini digunakan untuk membandingkan dua strings secara leksikal dengan mengabaikan case sensitive
                return i ;
            }
        }
        return -1 ;  
    }
}
