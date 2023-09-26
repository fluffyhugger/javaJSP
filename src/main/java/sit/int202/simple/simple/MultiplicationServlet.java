package sit.int202.simple.simple;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MultiplicationServlet", value = "/multiplication_table")
public class MultiplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        if(number == null || number.length() == 0 || !isNumber(number)){
            request.setAttribute("message","Invalid Number or null parameter !!!");
        }
        request.getRequestDispatcher("multiplication_table.jsp").forward(request,response);
    }
    private boolean isNumber(String numberStr){
        for (int i = 0; i < numberStr.length(); i++) {
            if(! Character.isDigit(numberStr.charAt(i))){
                return false;
            }
        }
        return true;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
