package vn.WebTest.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/DemoToeic-Servlet")
public class SimpleServlet extends  HttpServlet  {
    protected  void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException , IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");//in Html
        List<String> listStudends = new ArrayList<>();
        out.println("Hello html- servlet");
        listStudends.add("Student 1");
        listStudends.add("Student 2");
        listStudends.add("Student 3");
        out.println("<table>");
        for (String item: listStudends) {
            out.println("<tr>");
            out.println("<td>");
            out.println(item);
            out.println("</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{

    }
}
