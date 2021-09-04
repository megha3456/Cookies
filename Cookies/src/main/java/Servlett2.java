

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Servlett2
 */
public class Servlett2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlett2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			Cookie ck[]=request.getCookies();
			
			for (int i =0; i<ck.length; i++)
			{
				out.println("<center><h1><font color = 'green' >Name: "+ck[0].getValue()+ "</font></h1>");
			}
			out.print("<form action = 'Servlett3'>");
			out.print("<br><input type = 'submit' value= 'Log out'>");
			out.print("</form>");
			out.close();
			
			
		}catch (Exception e) {System.out.println(e);}
	}

}
