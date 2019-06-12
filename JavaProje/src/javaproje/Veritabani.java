/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproje;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muhammed
 */
public class Veritabani {

    static String url = "jdbc:mysql://localhost:3306/otelrezervasyon?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static String user = "root";
    static String password = "istanbul";

    static Connection myConn;
    static PreparedStatement myStat,statUpdate,statSorgu;
    static ResultSet myResult;

    public static ResultSet dbGoster(String sql_sorgu) {
        try {
            dbOpen();
            myResult= myStat.executeQuery(sql_sorgu);
            

        } catch (Exception e) {
            e.printStackTrace();
        }

        return myResult;

    }

    public static boolean dbEkle(String sql_sorgu) { // Veritabinina müşteri veya kullanıcı eklemek için
        try {
            dbOpen();
            myStat.executeUpdate(sql_sorgu);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        return false;
    }
    
    public static boolean dbUpdate(String sql_sorgu){
        try {
            if(myConn==null){
                dbOpen();
            }
            statUpdate = myConn.prepareStatement("sql");
            statUpdate.executeUpdate(sql_sorgu);
            
            return true ;
            
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public static void dbClose() {
        if(myConn != null){
            try {
                myConn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void dbOpen(){
        try {
            
            myConn = (Connection) DriverManager.getConnection(url, user, password);
            myStat = myConn.prepareStatement("sql");
            
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void dbLog(String islemTipi){
        String sql_sorgu = "INSERT INTO log(log_islem,log_kullanici,log_odaNo) VALUES('"+islemTipi+"','"+AdminGirisi.kullaniciAd+"',"+AdminSecim.seciliOda+")";
        dbEkle(sql_sorgu);
    }
    
    public static ResultSet dbSorgu(String sql_sorgu){
        try {
             dbOpen();
             statSorgu = myConn.prepareStatement("sql");
             myResult = statSorgu.executeQuery(sql_sorgu);
             myResult.first();
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return myResult;
    }
    
}
