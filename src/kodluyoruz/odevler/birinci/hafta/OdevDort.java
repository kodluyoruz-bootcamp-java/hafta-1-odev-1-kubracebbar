package kodluyoruz.odevler.birinci.hafta;

import java.util.Scanner;

public class OdevDort {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayi girin: ");
        double sayi;
        sayi = scanner.nextDouble();
        System.out.println("Girilen sayinin asagıya yuvarlanmasını istiyorsanız 1 tuşuna yukarıya yuvarlanmasını istiyorsanız 2 tuşuna basın.");
        int secim;

        while (true) {
            secim = scanner.nextInt();
            if (secim == 1) {
                System.out.println(Math.floor(sayi));
                break;

            } else if (secim == 2) {

                System.out.println(Math.ceil(sayi));
                break;
            } else
                System.out.println("Geçersiz Sayi Girişi Tekrar Sayi Girin");
        }
    }

}
