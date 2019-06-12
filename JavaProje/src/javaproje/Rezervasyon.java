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
import static javaproje.AdminSecim.odaNo;
import javax.swing.JOptionPane;

/*
 EXİT metodunu yaz kullanıcı çıkıs yaparken ücretini hesaplayacak.**

 */
public class Rezervasyon {

    public static void musteriRezervasyon(Musteri musteri) {//Müşteriyi veritabanına kayıt eder.
        rezervasyonTipi();
        Oda.odaFiyatlama();
        Oda.odaIndirim(musteri);

        String sql_sorgu = "INSERT INTO musteri (musteri_ad,musteri_soyad,oda_id,musteri_ucret) VALUES('" + musteri.getmAd() + "','" + musteri.getmSoyad() + "'," + AdminSecim.seciliOda + "," + Oda.odaFiyat + ")";
        if (Veritabani.dbEkle(sql_sorgu)) {
            sql_sorgu = ("UPDATE otel SET oda_doluMu =" + 1 + " WHERE oda_id =" + AdminSecim.seciliOda);
            Veritabani.dbEkle(sql_sorgu);
            Veritabani.dbLog("Müşteri Kayıt"); // LOG KAYIT
            Veritabani.dbClose();
        }
    }

    public static void rezervasyonTipi() {
        if (AdminSecim.rezervasyonTipi == 0) {
            Oda.odaFiyat += 50;
        } else if (AdminSecim.rezervasyonTipi == 1) {
            Oda.odaFiyat += 60;
        } else if (AdminSecim.rezervasyonTipi == 2) {
            Oda.odaFiyat += 70;
        } else if (AdminSecim.rezervasyonTipi == 3) {
            Oda.odaFiyat += 80;
        }
    }

    public static boolean exit() { // Müşteri çıkış yaparken ödenek ücreti hesaplar. **
        String sql_sorgu = "SELECT * FROM musteri";

        ResultSet rsCikis = Veritabani.dbGoster(sql_sorgu);

        try {
            while (rsCikis.next()) {
                int dbOda = Integer.parseInt(rsCikis.getString("oda_id"));
                if (dbOda == AdminSecim.odaNo) {
                    
                    if(JOptionPane.showConfirmDialog(null,"Çıkış","Çıkış Onay",JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION){
                    sql_sorgu = ("UPDATE otel SET oda_doluMu=" + 0 + " WHERE oda_id=" + odaNo);
                    if (Veritabani.dbUpdate(sql_sorgu)) {
                        sql_sorgu = ("DELETE FROM musteri where oda_id =" + dbOda);
                        Veritabani.dbUpdate(sql_sorgu);
                        Veritabani.dbLog("Müşteri Çıkışı"); // LOG KAYIT
                        return true;
                    }}
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rezervasyon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void siparis() { // Müşteri siparişlerini yapar veritabanına müsteri ücretine ekleme yapar. **
        String sql_sorgu;
        if (AdminSecim.siparisTipi == 0) {
            sql_sorgu = "UPDATE musteri SET musteri_ucret = musteri_ucret + 10 WHERE oda_id =" + AdminSecim.seciliOda; // YEMEK FİYATLANDIRMA SEKMESİ EKLE **
            // UCRETİ Bİ İNT DEGİSKEN TARAFINDAN VER **
            Veritabani.dbLog("Sipariş Yemek"); // LOG KAYIT

        } else {
            sql_sorgu = "UPDATE musteri SET musteri_ucret = musteri_ucret + 5 WHERE oda_id =" + AdminSecim.seciliOda;
            Veritabani.dbLog("Sipariş İçecek"); //LOG KAYIT
        }

        Veritabani.dbUpdate(sql_sorgu);

    }

}
