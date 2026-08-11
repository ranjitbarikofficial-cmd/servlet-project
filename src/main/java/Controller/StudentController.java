package Controller;

import DAO.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/student")
public class StudentController extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String mail = req.getParameter("mail");
        String address = req.getParameter("address");
        int age = Integer.parseInt(req.getParameter("age"));


        System.out.println("Name: " + name);
        System.out.println("Mail: " + mail);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);


        Student student = new Student(name, mail, address, age);


        StudentDao dao = new StudentDao();
        dao.saveStudent(student);

        res.setContentType("text/html");
        res.getWriter().println("<h2>Student Saved Successfully!</h2>");
    }
}