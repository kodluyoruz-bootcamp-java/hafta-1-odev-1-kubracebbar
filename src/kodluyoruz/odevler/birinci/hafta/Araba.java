package kodluyoruz.odevler.birinci.hafta;

public class Araba {
    private String renk;
    private int tekerlekSayisi;
    private String marka;
    private int model;
    private String yakitTuru;

    public Araba(String renk, int tekerlekSayisi, String marka, int model, String yakitTuru) {
        this.renk = renk;
        this.tekerlekSayisi = tekerlekSayisi;
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
    }

    public void yazdir() {
        System.out.println("Renk:" + renk + " Tekerlek Sayisi:" + tekerlekSayisi + " Marka:" + marka + " Model:" + model + " Yakit Turu:" + yakitTuru);
    }
}
