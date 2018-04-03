package utils;

public class ApplicationData {

	private static ApplicationData instance = null;

	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String DB_PATH = "jdbc:mysql://localhost:3307//zamowienia";
	private final static String USER = "root";
	private final static String PASSWORD = "";

	private ApplicationData() {
	}

	public static synchronized ApplicationData getInstance() {
		if (instance == null) {
			instance = new ApplicationData();
		}
		return instance;

	}

	public static String getDriver() {
		return DRIVER;
	}

	public static String getDbPath() {
		return DB_PATH;
	}

	public static String getUser() {
		return USER;
	}

	public static String getPassword() {
		return PASSWORD;
	}

}
