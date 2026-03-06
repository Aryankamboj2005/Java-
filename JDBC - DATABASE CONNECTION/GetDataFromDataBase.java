// fetching values form the data base

import java.sql.*;

public class GetDataFromDataBase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/academiq";
        String username = "root";
        String password = "Aryan2005@";

        String query = "select * from students";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url ,username , password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        while(rs.next())
        {
            int id = rs.getInt("id");
            String name  = rs.getString("name");
            String roll_no = rs.getString("roll_no");
            String semester = rs.getString("semester");
            String course = rs.getString("course");
            String email = rs.getString("email");

            System.out.println(id+" "+name+" "+roll_no+" "+semester+" "+course+" "+email);
        }
        st.close();
        con.close();
    }
}