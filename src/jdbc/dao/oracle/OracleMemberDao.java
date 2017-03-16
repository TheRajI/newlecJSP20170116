package jdbc.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.data.dao.MemberDao;
import jdbc.data.entity.Member;

public class OracleMemberDao implements MemberDao {

   @Override
   public List<Member> getList(String query){

        String sql = "SELECT  * FROM MEMBER where MID LIKE '%" + query +"%'";
        List<Member> list = new ArrayList<>();
        
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
         Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(sql);

         Member member = null;

         while (rs.next()) {
            member = new Member();
            member.setMid(rs.getString("MID"));
            member.setPwd(rs.getString("PWD"));
            list.add(member);
         }
         rs.close();
         st.close();
         con.close();

      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

         return list;
   }

   @Override
   public int add(Member member) {
        
	   String sql = "INSERT INTO MEMBER(MID,NAME,PHONE) VALUES(?,?,?)";
        
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
         Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
         PreparedStatement st = con.prepareStatement(sql);
         st.setString(1, member.getMid());
         st.setString(2, member.getName());
         st.setString(3, member.getPhone());
         
        
         int result = st.executeUpdate();
         
         st.close();
         con.close();
         
         return result;

      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

         return 0;
   }

   public int update(Member member) {
       
	   String sql = "UPDATE MEMBER SET NAME=?, PHONE=? WHERE MID=?";
        
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
         Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
         PreparedStatement st = con.prepareStatement(sql);
         
       
         st.setString(1, member.getName());
         st.setString(2, member.getPhone());
         st.setString(3, member.getMid());
        
        
         int result = st.executeUpdate();
         
         st.close();
         con.close();
         
         return result;

      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

         return 0;
   }


  public int delete(Member member) {
       
	   String sql = "DELETE FROM MEMBER WHERE MID=?";
        
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
         Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
         PreparedStatement st = con.prepareStatement(sql);
         st.setString(1, member.getMid());
                
         int result = st.executeUpdate();
         
         st.close();
         con.close();
         
         return result;

      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

         return 0;
   }


}