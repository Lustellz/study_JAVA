package kosta.phone;

public class General extends PhoneInfo {

	private int type;
	
	General(){
		
	}
	
	General(String name, String phoneNo, String birthday, int type){
		super(name, phoneNo, birthday);
		this.type=type;
	}


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
