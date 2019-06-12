/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muhammed
 */
public class Musteri {

    private String mAd;
    private String mSoyad;
    private int mYas;
    private String mMeslek;
    
    public static String ucretHesapla(){ // Müşterinin ücretini hesaplar.
        String ucret="";
        try {
            ucret = Veritabani.dbSorgu("SELECT * FROM musteri WHERE oda_id ="+AdminSecim.odaNo).getString("musteri_ucret");
        } catch (SQLException ex) {
            Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return ucret;
    }
    public String toString(){
        return "Müşteri adı :"+mAd+"Müşteri Soyadı :"+mSoyad+"Müşteri Yaşı :"+mYas+"Müşteri Mesleği :"+mMeslek;
    }

    public String getmAd() {
        return mAd;
    }

    public void setmAd(String mAd) {
        this.mAd = mAd;
    }

    public String getmSoyad() {
        return mSoyad;
    }

    public void setmSoyad(String mSoyad) {
        this.mSoyad = mSoyad;
    }

    public int getmYas() {
        return mYas;
    }

    public void setmYas(int mYas) {
        this.mYas = mYas;
    }

    public String getmMeslek() {
        return mMeslek;
    }

    public void setmMeslek(String mMeslek) {
        this.mMeslek = mMeslek;
    }

}
