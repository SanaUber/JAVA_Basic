package com.codewithsana;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

    /**
     * @param args
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
 

        Class.forName(Config.JDBC_DRIVER);

            // Establish Connection
            Connection con = DriverManager.getConnection(Config.JDBC_URL, Config.JDBC_USERNAME, Config.JDBC_PASSWORD);



        //Connection con =DriverManager.getConnection(url,username,password);
        System.out.println("connected successfully");
        Statement st=con.createStatement();
        int delid=2;
        int updateid=4;
        int toupdateid=4;
        String updatenam="sana4";
        String updatedes="Dev4";
        String delQ="DELETE FROM jdbc.demo WHERE id=?;";
        String updQ="UPDATE jdbc.demo SET id=? , name=?, desig=?  WHERE id = ? ";
        String inserQ="INSERT INTO jdbc.demo VALUES (?,?,?)";
        PreparedStatement pst=con.prepareStatement(inserQ);
        PreparedStatement pstd=con.prepareStatement(delQ);
        PreparedStatement pstu=con.prepareStatement(updQ);
        int id=5;
        String name="sana5";
        String desg="Dev5";
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, desg);
        pstd.setInt(1,delid);
        pstu.setInt(1,updateid);
       
        pstu.setString(2, updatenam);
        pstu.setString(3, updatedes);
        pstu.setInt(4, toupdateid);
       int count=pst.executeUpdate();
       int countD=pstd.executeUpdate();
       int countU=pstu.executeUpdate();
        String userdata="";
        ResultSet rs=st.executeQuery("SELECT * FROM jdbc.demo");
        
        while(rs.next())
        {userdata=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3);
        		
       System.out.println(userdata);}
st.close();
con.close();
        // write your code here
    }

}

