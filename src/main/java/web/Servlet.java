
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        //Definimos el tipo de archivo
        response.setContentType("text/html;charset=UTF-8");
        
        //Traemos la session de tipo Http
        HttpSession sesion = request.getSession();
        
        //Creamos una lista de los checks y traemos el articulo
        String[] articulos = (String[]) request.getParameterValues("articulo");

        
        
        
       
        
        PrintWriter out = response.getWriter();
        
        
        if(articulos!=null){
           for(String elemTemp:articulos){
               out.print("<li>");
               out.print(elemTemp);
               out.print("</li>");
           }
        }
        
    }
    
    
}
