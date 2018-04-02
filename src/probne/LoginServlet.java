package probne;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter writer = response.getWriter();

		writer.println("		<div class=\"item\">\r\n" + "        <div class=\"name black\">nawza</div>\r\n"
				+ "        <div class=\"action green\">data1</div>\r\n"
				+ "        <div class=\"action orange\">data2</div>\r\n"
				+ "        <div class=\"action red\">data3</div>\r\n" + "        <div class=\"action black\">\r\n"
				+ "            puste bo nie dotyczy\r\n" + "        </div>\r\n"
				+ "        <div class=\"action red\">data4</div>\r\n" + "        <div class=\"info\">info</div>\r\n"
				+ "    </div>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Witaj " + request.getParameter("login"));
		doGet(request, response);
	}

}
