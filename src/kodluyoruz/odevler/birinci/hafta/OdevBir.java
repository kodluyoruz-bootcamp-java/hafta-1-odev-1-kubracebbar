package kodluyoruz.odevler.birinci.hafta;

public class OdevBir {
    public static void main(String[] args) {
        float ortalama = 0f;
        int sayac = 0;
        for (int i = 0; i < 2000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0) && (i % 53 == 0)) {

                sayac++;
                ortalama = i / sayac;

            }

        }
        System.out.println(ortalama);
    }

}
