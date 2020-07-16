package kosta.mission;

public class DaoMain {

	public static void main(String[] args) {
		Service service = new Service();
		MySQLDao sql = new MySQLDao();
		OracleDao oracle = new OracleDao();
		service.setDao(sql);
		service.getDao().insert();
		service.setDao(oracle);
		service.getDao().insert();
	}

}
