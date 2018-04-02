package database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import probne.proba;

/**
 * Servlet implementation class DataBaseConnect
 */
@WebServlet("/DataBaseConnect")
public class DataBaseConnect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DataBaseConnect() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		System.out.println("Witaj swiecie");

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.getRequestDispatcher("proba2.jspf");
		
		String cos = request.getRequestDispatcher("proba2.jspf").toString();
System.out.println(cos);
		
		proba p = new proba();
		p.powiedz();
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter writer = response.getWriter();

		writer.println("<div>");

		writer.println("WItaj swiecie w metodie do get");

		writer.println("</div>");

		// String data = "Hello World!";
		// response.setContentType("text/plain");
		// response.setCharacterEncoding("UTF-8");
		// response.getWriter().write(data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
