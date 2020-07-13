package kosta.video;

public class SpecialMember extends GeneralMember {
	private int bonus;

	SpecialMember(String id, String name, String address, Video[] loaned, int bonus ) {
	
		super(id, name, address, loaned);
		
		this.setBonus(bonus);
		
		System.out.println("회원의 보너스 포인트 적립: " + bonus);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
