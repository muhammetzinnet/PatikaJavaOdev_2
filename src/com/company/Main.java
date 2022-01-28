package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double kdv=0.18, fiyat, kdvTutar, yuksekFiyatKdv=0.08;

        System.out.println("KDV'li fiyatı bulan program");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tuta giriniz= ");
        fiyat=scanner.nextDouble();

        kdvTutar=fiyat*kdv;
        kdvTutar=fiyat*yuksekFiyatKdv;


        if (fiyat<1000){
            System.out.println("KDV'li fiyat "+(fiyat+kdvTutar));
        }else {
            System.out.println("Yüksek fiyat KDV'li fiyat= "+(fiyat+kdvTutar));
        }

    }
}
