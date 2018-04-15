package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Plant;

/**
 * Servlet implementation class PlantServlet
 */
@WebServlet("/PlantServlet")
public class PlantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlantServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Witaj swiecie hasfgasjy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("Witaj swiecie");
//		PlantDAO plantDAO = new PlantDAO();
//
//		Plant roslina = new Plant("roslinka", "2018-01-01", 1, "2018-01-01", 1, "2018-01-01", 1, "2018-01-01", 1,  "2018-01-01",
//				1, "opis pierwqszy", "opis drugi", "opius trzeci");
////
////		plantDAO.create(roslina);
//
//	Plant plant = new Plant.Builder().name("Rolsinka fg")
//									.sprayDate("2018-03-30")
//									.sprayDays(3)
//									.wateringDate("2018-03-03")
//									.wateringDays(3)
//									.exaggerationDate("2018-03-30")
//									.exaggerationDays(3)
//									.pruningDate("2018-04-04")
//									.pruningDays(4)
//									.fertilizationDate("2018-03-03")
//									.fertilizationDays(3)
//									.plantingDescription("Opis rosliny")
//									.wateringDescription("opis podlawania")
//									.requirementsDescription("Opis wymagan")
//									.build();
//
//	System.out.println(plant.getName());
//	System.out.println("heh");
	
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
