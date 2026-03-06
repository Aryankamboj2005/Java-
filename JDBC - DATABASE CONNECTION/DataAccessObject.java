import java.sql.*;

public class DataAccessObject {

    public static void main(String[] args) throws Exception {

        StudentDAO DAO = new StudentDAO();

        Student s1 = DAO.getName(1);

        System.out.println(s1.sname);
    }
}

class StudentDAO{

    String url = "jdbc:mysql://localhost:3306/academiq";
    String username = "root";
    String password = "Aryan2005@";

    public Student getName(int id) throws Exception{

        Student s = new Student();

        s.rollno = id;

        String query = "select name from students where id=" + id;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url ,username , password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        if(rs.next())
        {
            String name = rs.getString(1);
            s.sname = name;
        }

        return s;
    }
}

class Student{

    int rollno;
    String sname;

}