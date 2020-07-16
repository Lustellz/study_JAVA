package kosta.mission;

public class Service {
	private Dao dao;

	Service(){}
	
	Service(String driver_name){
		System.out.println("Driver is:"+driver_name);
	}
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
}
