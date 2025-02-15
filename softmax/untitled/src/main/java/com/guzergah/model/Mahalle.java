package com.guzergah.model;

public class Mahalle {
    private String adi;
    private double nufusYogunlugu;
    private double ulasimAltyapisi;
    private double maliyet;
    private double cevreselEtki;
    private double sosyalFayda;
    private double skor;

    public Mahalle(String adi, double nufusYogunlugu, double ulasimAltyapisi, double maliyet, double cevreselEtki, double sosyalFayda) {
        this.adi = adi;
        this.nufusYogunlugu = nufusYogunlugu;
        this.ulasimAltyapisi = ulasimAltyapisi;
        this.maliyet = maliyet;
        this.cevreselEtki = cevreselEtki;
        this.sosyalFayda = sosyalFayda;
    }

    public String getAdi() { return adi; }
    public double getNufusYogunlugu() { return nufusYogunlugu; }
    public double getUlasimAltyapisi() { return ulasimAltyapisi; }
    public double getMaliyet() { return maliyet; }
    public double getCevreselEtki() { return cevreselEtki; }
    public double getSosyalFayda() { return sosyalFayda; }
    public double getSkor() { return skor; }
    public void setSkor(double skor) { this.skor = skor; }

    public static Mahalle[] veriOlustur() {
        return new Mahalle[]{
                new Mahalle("Karakaş Mahallesi", 95, 80, 10, 20, 90),
                new Mahalle("Bademlik Mahallesi", 70, 60, 30, 50, 65),
                new Mahalle("Karahıdır Mahallesi", 60, 50, 40, 60, 55)
        };
    }
}
