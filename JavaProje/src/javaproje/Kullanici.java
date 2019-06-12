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
public class Kullanici {
    private  String kullaniciAd;
    private  String kullaniciSoyad;
    private  String kullaniciHesap;
    private  String kullaniciSifre;
    private  String kullaniciYetki;
    
    
    public void kullaniciEkle(){ // veritabanına kullanıcı ekler

        String sql_sorgu;
        sql_sorgu = "INSERT INTO admin(admin_ad,admin_soyad,admin_kullanici,admin_sifre,admin_yetki) VALUES('"+kullaniciAd+"','"+kullaniciSoyad+"','"+kullaniciHesap+"','"+kullaniciSifre+"','"+kullaniciYetki+"')";
        Veritabani.dbEkle(sql_sorgu);
    }
    
    public void kullaniciSil(){ // veritabanından kullanici siler.
        String sql_sorgu;
        sql_sorgu = "DELETE FROM admin WHERE admin_kullanici = '"+kullaniciHesap+"'";
        Veritabani.dbUpdate(sql_sorgu);
        
    }
    
    public void kullaniciGuncelle(){
        String sql_sorgu;
        sql_sorgu = "UPDATE admin SET admin_sifre ='"+kullaniciSifre+"' , admin_yetki ='"+kullaniciYetki+"' WHERE admin_kullanici ='"+kullaniciHesap+"'";
        Veritabani.dbUpdate(sql_sorgu);
        
    }
    
    

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getKullaniciSoyad() {
        return kullaniciSoyad;
    }

    public void setKullaniciSoyad(String kullaniciSoyad) {
        this.kullaniciSoyad = kullaniciSoyad;
    }

    public String getKullaniciHesap() {
        return kullaniciHesap;
    }

    public void setKullaniciHesap(String kullaniciHesap) {
        this.kullaniciHesap = kullaniciHesap;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

    public String getKullaniciYetki() {
        return kullaniciYetki;
    }

    public void setKullaniciYetki(String kullaniciYetki) {
        this.kullaniciYetki = kullaniciYetki;
    }
}
    
    
    
