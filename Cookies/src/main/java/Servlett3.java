

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Servlett3
 */
public class Servlett3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlett3() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie ck = new Cookie("uname", "");
		ck.setMaxAge(0);
		response.addCookie(ck);
		out.println("<center><marquee><h1><font color = 'blue'>You are logged out Successfully...</font></h1></marquee>");
		out.println("<br><form action='Servlett2'>");
		out.println("<input type ='submit' value = 'Check cookie'>");
		out.println("</form>");
		
	}

}
