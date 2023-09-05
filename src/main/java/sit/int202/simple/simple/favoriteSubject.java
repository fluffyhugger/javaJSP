package sit.int202.simple.simple;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.simple.simple.entities.Subject;
import sit.int202.simple.simple.repositories.SubjectRepository;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "FavoriteSubjectServlet ", value = "/favoriteSubject")
public class favoriteSubject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SubjectRepository sr =new SubjectRepository();
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String subject[] = request.getParameterValues("subject");

        out.println("<html><body>");
        out.println("<h1>You favorite subject is :: </h1><hr>");
        out.println("Your student id" + id + "<br>");
        out.println("Your student name" + name + "<br>");
        for(Subject subjects : sr.findAll()){
            out.println("&nbsp &nbsp ; -" + subjects + "<br>");
        }
        out.println("<hr>");
        out.println("<h3>This is the getParameterMap</h3>");
        Map<String,String[]> map = request.getParameterMap();
        out.println("Your student id" + map.get("id")[0] + "<br>");
        out.println("Your student name" + map.get("name")[0] + "<br>");
        for(String subjects : map.get("subject")){
            out.println("&nbsp &nbsp ; -" + subjects + "<br>");
        }
        out.println("<hr>");
        out.println("<a href='favorite_subject.html'> Back </a>");
        out.println("</body></html>");


       //  out.println(request.getParameter("id") +" "+ request.getParameter("name") +" "+ request.getParameter("subject"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
