package kosta.oop;

public class Grade {

	private String name;
	private int ko;
	private int eng;
	private int math;
	private int avg_score;
	private int sum_score;
	
	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	Grade(){};
	
	Grade(String name, int ko, int eng, int math){
		this.name = name;
		this.ko = ko;
		this.math = math;
		this.sum_score=sum(ko,eng,math);
		this.avg_score=avg(this.sum_score);
		System.out.println("이름: "+this.name+" 총점: "+this.sum_score+" 평균: "+this.avg_score);
	}
	
	public static int sum(int ko, int eng, int math) {
		return ko+eng+math;
	}
	
	public static int avg(int sum) {
		return sum/3;
	}
}
