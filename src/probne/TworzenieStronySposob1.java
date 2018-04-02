package probne;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TworzenieStronySposob1
 */
@WebServlet("/TworzenieStronySposob1")
public class TworzenieStronySposob1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TworzenieStronySposob1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // Do odczytu

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
         
        PrintWriter writer = response.getWriter();
         
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<div>");
        writer.println(" Witam tutaj jest tersc do wyswietlania " + request.getParameter("nazwaParametru"));
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");
	}

	
	// Do zapisu i modyfilacji
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
        PrintWriter writer = response.getWriter();
         
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<div>");
        writer.println(" Witam tutaj jest tersc do wyswietlania " + request.getParameter("nazwaParametru"));
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");
	}

}
