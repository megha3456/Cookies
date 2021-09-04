

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Cksv1
 */
public class Cksv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Cksv1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String n = request.getParameter("id");
			String password = request.getParameter("password");
			if(n.equals("Megha") && password.equals("1234")) {
			out.print("<center><h1><font color = 'red'>Welcome " +n + "</font></h1>");
			}else
			{
				response.sendRedirect("Error.html");
			}
			Cookie ck = new Cookie("uname", n);
			response.addCookie(ck);
			
			
			out.print("<form action = 'Servlett2'>");
			out.print("<br><input type = 'submit' value= 'Go to servlet 2'>");
			out.print("</form>");
			out.close();
			
		}catch(Exception e) {System.out.println(e);}
	}

}
