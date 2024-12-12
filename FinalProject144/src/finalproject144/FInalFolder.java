
package finalproject144;


import java.sql.*;

public class FinalFolder {
Connection con;
PreparedStatement myquery;
public FinalFolder(){
    String url="jdc.mysql://localhost:3306/FinalProject";
    String login="root";
    String password="";
    System.out.print("Congrats!");
    try{
        con=DriverManager.getConnection(url, login, password);
    }
    catch(SQLException ex){
        ex.printStackTrace();
    }
    
}
public static void InsertMethod(String l, String f, String ft, String n, String a1, String a2, String c, String s){
    String SqlCode="insert into employees"+"(lastname, firstnme, phoneType, phoneNumber, address1, address2, city, state)"
            + ""+"values ("+l+","+f+","+ft+","+n+","+a1+","+a2+","+c+","+s+");";
    
}
}
