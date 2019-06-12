/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproje;

/**
 *
 * @author muhammed
 */
public class Oda {

    private int odaTipi;  // 1 ise ekonomik , 2 ise normal , 3 ise kral dairesi
    public static double odaFiyat=0;
    private String odaOzellik;
    private boolean odaDoluMu = false;
    
    public static void odaFiyatlama(){
       if("Kral".equals(AdminSecim.odaTipi) || "kral".equals(AdminSecim.odaTipi)){
           odaFiyat=300;
       }
       else if("Normal".equals(AdminSecim.odaTipi) || "normal".equals(AdminSecim.odaTipi)){
           odaFiyat=200;
       }
       
       else if("Ekonomik".equals(AdminSecim.odaTipi) || "ekonomik".equals(AdminSecim.odaTipi)){
           odaFiyat=100;
       }
    }
    public static void odaIndirim(Musteri musteri) { // Oda tutarken tutan kişinin yaşına göre indirim uygular.
        if (musteri.getmYas() > 0 && musteri.getmYas() < 13) {
            odaFiyat = odaFiyat / 2; // Yaşı 13 den küçük kişiler için %50 indirim uygulanıyor.
        } else if (musteri.getmYas() > 60) {
            odaFiyat = odaFiyat * 3 / 10; // Yaşı 60 dan büyük kişiler için %30 indirim uygulanıyor.
        }
    }

    public int getOdaTipi() {
        return odaTipi;
    }

    public void setOdaTipi(int odaTipi) {
        this.odaTipi = odaTipi;
    }

    public double getOdaFiyat() {
        return odaFiyat;
    }

    public void setOdaFiyat(double odaFiyat) {
        this.odaFiyat = odaFiyat;
    }

    public String getOdaOzellik() {
        return odaOzellik;
    }

    public void setOdaOzellik(String odaOzellik) {
        this.odaOzellik = odaOzellik;
    }

    public boolean isOdaDoluMu() {
        return odaDoluMu;
    }

    public void setOdaDoluMu(boolean odaDoluMu) {
        this.odaDoluMu = odaDoluMu;
    }

}
