package com.guzergah;

import com.guzergah.model.Mahalle;
import com.guzergah.analiz.MaliyetFaydaAnalizi;

public class Main {

    public static void main(String[] args) {
        Mahalle[] mahalleler = Mahalle.veriOlustur();

        Mahalle enIyi = MaliyetFaydaAnalizi.enUygunGuzergah(mahalleler);

        System.out.println("\nSoftmax Skorları:");
        for (Mahalle mahalle : mahalleler) {
            System.out.printf("%s -> Skor: %.4f%n", mahalle.getAdi(), mahalle.getSkor());
        }

        System.out.println("\n En uygun güzergah: " + enIyi.getAdi());
    }
}
