package com.guzergah.algoritma;

import java.util.Arrays;

public class Softmax {

    public static double[] hesapla(double[] degerler) {
        int n = degerler.length;
        if (n == 0) return new double[0];
        if (n == 1) return new double[]{1.0};

        double maxDeger = Arrays.stream(degerler).max().orElse(Double.NEGATIVE_INFINITY);
        double toplamExp = 0.0;
        double[] expDegerler = new double[n];

        for (int i = 0; i < n; i++) {
            expDegerler[i] = Math.exp(degerler[i] - maxDeger);
            toplamExp += expDegerler[i];
        }

        double[] softmaxSonuclari = new double[n];
        for (int i = 0; i < n; i++) {
            softmaxSonuclari[i] = expDegerler[i] / toplamExp;
        }

        return softmaxSonuclari;
    }
}
