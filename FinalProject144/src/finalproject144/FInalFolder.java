
package finalproject144;


import java.sql.*;

public class FinalFolder {
static Connection con;
static PreparedStatement myquery;
public FinalFolder(){
    String url="jdbc:mysql://localhost:3306/finalproject";
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
public void InsertMethod(String l, String f, int ft, String n, String a1, String a2, String c, String s){
    String SqlCode="insert into employee"+"(lname, fname, ptype, pnumber, address1, address2, city, state)"
            + ""+"values ("+"'"+l+"'"+","+"'"+f+"'"+","+ft+","+"'"+n+"'"+","+"'"+a1+"'"+","+"'"+a2+"'"+","+"'"+c+"'"+","+"'"+s+"'"+");";
    try{
    myquery=con.prepareStatement(SqlCode);
    myquery.execute();
    }
    catch(SQLException ex){
        ex.printStackTrace();
    }
}

}
