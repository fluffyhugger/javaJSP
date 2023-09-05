package sit.int202.simple.simple;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalcGradeServlet", value = "/grade")
public class CalcGradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int score = Integer.parseInt(request.getParameter("score"));
        CalcGrade cg = new CalcGrade(score);
        String color;
        PrintWriter out = response.getWriter();
        out.println("<h1 style='color:red'> This is calc grade </h1>");
        out.println("<h3> Your grade is " + score  + "</h3>");
        if(cg.getScoreNum() >= 80){
            color = "blue";
        }else if(cg.getScoreNum() >= 70){
            color = "black";
        }
        else if(cg.getScoreNum() >= 60){
            color ="yellow";
        }else{
            color = "red";
        }
        out.println("<h3 style='color:"+ color + ";'> You grade is " + cg.getScore() +"</h3>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
