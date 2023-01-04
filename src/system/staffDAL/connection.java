/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.staffDAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author javie
 */
public class connection {
    
    String strConnectionDB="jdbc:sqlite:C:/Users/javie/OneDrive/Documentos/db/crud.s3db";
    Connection conn=null;
    public connection (){
        try {
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(strConnectionDB);
            System.out.println("connection done");
        } catch (Exception e) {
            System.out.println("wrong in connection" +  e);
        }
    }
    
    public int excuteSQLSentence(String strSQLSentence){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSQLSentence);
            pstm.execute();
            return 1;
        } catch (Exception e) {
            System.out.println("wrong"+e);
            return 0;
        }
    }
    
    public ResultSet queryRecords(String strSQLSentence){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSQLSentence);
            ResultSet response= pstm.executeQuery();
            return response;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
