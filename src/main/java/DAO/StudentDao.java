package DAO;

import Controller.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDao {

    public void saveStudent(Student student) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "ranjitbarik";

        String sql = "INSERT INTO student(name, mail, address, age) VALUES (?, ?, ?, ?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getMail());
            ps.setString(3, student.getAddress());
            ps.setInt(4, student.getAge());

            ps.executeUpdate();

            System.out.println("Data inserted into database");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}