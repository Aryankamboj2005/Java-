import java.sql.*;

public class insert_query {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/academiq";
        String username = "root";
        String password = "Aryan2005@";

       String query = "INSERT INTO students (name, roll_no, semester, course, email, password) " +
               "VALUES ('Aryan', 'YMCA123', '6', 'B.Tech CSE', 'aryankamboj@gmail.com', '12345')";
    
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url ,username , password);

        Statement st = con.createStatement();





        int count   = st.executeUpdate(query); // changes inside this 






        // while(rs.next())
        // {
        //     int id = rs.getInt("id");
        //     String name  = rs.getString("name");
        //     String roll_no = rs.getString("roll_no");
        //     String semester = rs.getString("semester");
        //     String course = rs.getString("course");
        //     String email = rs.getString("email");

        //     System.out.println(id+" "+name+" "+roll_no+" "+semester+" "+course+" "+email);
        // }
        System.out.println(count +" rows affeccted");
        st.close();
        con.close();
    }
}
