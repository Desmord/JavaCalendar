package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.Plant;
import utils.ApplicationData;

public class PlantDAO {
	private final static String CREATE = "INSERT INTO `plants`(`name`, `spray`, `sparyDays`, `watering`, `wateringDays`, `exaggeration`, `exaggerationDays`, `pruning`, `pruningDays`, `fertilization`, `fertilizationDays`, `plantingDescription`, `wateringDescription`, `requirementsDescription`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public boolean create(Plant plant) {
		try {
			Class.forName(ApplicationData.getDriver());
			Connection conn = DriverManager.getConnection(ApplicationData.getDbPath(), ApplicationData.getUser(),
					ApplicationData.getPassword());
			PreparedStatement prepStmt = null;
			boolean result = false;

			try {
				prepStmt = conn.prepareStatement(CREATE);
				prepStmt.setString(1, plant.getName());
				prepStmt.setString(2, plant.getSpray());
				prepStmt.setString(3, Integer.toString(plant.getSprayDay()));
				prepStmt.setString(4, plant.getWatering());
				prepStmt.setString(5, Integer.toString(plant.getWateringDay()));
				prepStmt.setString(6, plant.getExaggeration());
				prepStmt.setString(7, Integer.toString(plant.getExaggerationDay()));
				prepStmt.setString(8, plant.getPruning());
				prepStmt.setString(9, Integer.toString(plant.getPruningDay()));
				prepStmt.setString(10, plant.getFertilization());
				prepStmt.setString(11, Integer.toString(plant.getFertilizationDay()));
				prepStmt.setString(12, plant.getPlantingDescrition());
				prepStmt.setString(13, plant.getWateringDescription());
				prepStmt.setString(14, plant.getRequirementsDescription());

				int rowsAffected = prepStmt.executeUpdate();
				if (rowsAffected > 0) {
					result = true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (prepStmt != null) {
					prepStmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
			return result;

		} catch (Exception e) {
			System.out.println("Bład połączeniaczenia z baza danych " + e);
		}

		return true;
	}

	// private final static String READ = "SELECT isbn, title, description FROM book
	// WHERE isbn = ?;";
	// private final static String UPDATE = "UPDATE book SET isbn=?, title=?,
	// description=? WHERE isbn = ?;";
	// private final static String DELETE = "DELETE FROM book WHERE isbn=?;";

}
//
// private boolean executeQuery(String sqlStatement) {
//
// try {
//
// Class.forName(ApplicationData.getDriver());
// Connection conn =
// DriverManager.getConnection(ApplicationData.getDbPath(),ApplicationData.getUser(),
// ApplicationData.getPassword());
//
// Statement statement = conn.createStatement();
// final String sqlQuery = sqlStatement;
// statement.execute(sqlQuery);
//
// if (statement != null) {
// statement.close();
// }
// if (conn != null) {
// conn.close();
// }
//
// } catch (MySQLIntegrityConstraintViolationException e) {
//
// System.out.println("Index istnieje");
// return false;
//
// } catch (SQLException e) {
//
// System.out.println("Blad sql");
// System.out.println(e);
// return false;
//
// } catch (ClassNotFoundException e) {
// e.printStackTrace();
// return false;
// }
//
// return true;
// }
// ------------------------------------------------------------------
//
// response.setContentType("text/html");
// response.setCharacterEncoding("UTF-8");
//
// PrintWriter writer = response.getWriter();
//
// writer.println("<div>");
//
// writer.println("WItaj swiecie w metodie do get");
//
// writer.println("</div>");

// String data = "Hello World!";
// response.setContentType("text/plain");
// response.setCharacterEncoding("UTF-8");
// response.getWriter().write(data);

// response.setContentType("text/html");
// response.setCharacterEncoding("UTF-8");
//
// PrintWriter writer = response.getWriter();
//
// writer.println("<html>");
// writer.println("<body>");
// writer.println("<div>");
// writer.println(" Witam tutaj jest tersc do wyswietlania " +
// request.getParameter("nazwaParametru"));
// writer.println("</div>");
// writer.println("</body>");
// writer.println("</html>");
