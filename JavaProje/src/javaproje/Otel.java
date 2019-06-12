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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muhammed
 */
public class Otel {
    private String otelAdres;
    private String otelSahipAd;
    private int otelYildizSayisi;
    private int otelOdaSayi;
    
    
    public static ResultSet display(){ // db'den otelde kalan müşteri bilgilerini çeker.
        String sql_sorgu = "SELECT * FROM musteri";
        ResultSet rsDisplay = Veritabani.dbGoster(sql_sorgu);
      
        return rsDisplay;
    }
    
    public static ResultSet odaListele(String odaTipi,String odaDurum){ // db'den oda durumlarını çeker
       String sql_sorgu = "select * from otel where oda_doluMu ="+odaDurum+" and oda_tipi ='"+odaTipi+"'";
       
        
       ResultSet rsBosOda = Veritabani.dbGoster(sql_sorgu);
       
       return rsBosOda;
    }
    
    
}
