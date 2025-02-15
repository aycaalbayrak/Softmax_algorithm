package com.guzergah.analiz;

import com.guzergah.model.Mahalle;
import com.guzergah.algoritma.Softmax;
import java.util.Arrays;

public class MaliyetFaydaAnalizi {

    private static double[] normalize(double[] values) {
        double min = Arrays.stream(values).min().orElse(0);
        double max = Arrays.stream(values).max().orElse(1);
        double[] normalizedValues = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            normalizedValues[i] = (values[i] - min) / (max - min);
        }
        return normalizedValues;
    }

    public static Mahalle enUygunGuzergah(Mahalle[] mahalleler) {
        double[] kriterDegerleri = new double[mahalleler.length];

        for (int i = 0; i < mahalleler.length; i++) {
            kriterDegerleri[i] = mahalleler[i].getNufusYogunlugu() +
                    mahalleler[i].getSosyalFayda() +
                    mahalleler[i].getUlasimAltyapisi() -
                    mahalleler[i].getMaliyet() -
                    mahalleler[i].getCevreselEtki();
        }

        double[] normalizedValues = normalize(kriterDegerleri);
        double[] softmaxSonuclari = Softmax.hesapla(normalizedValues);

        for (int i = 0; i < mahalleler.length; i++) {
            mahalleler[i].setSkor(softmaxSonuclari[i]);
        }

        return Arrays.stream(mahalleler).max((a, b) -> Double.compare(a.getSkor(), b.getSkor())).orElse(mahalleler[0]);
    }
}
