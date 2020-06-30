package kosta.mission;

public class Mission02 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 총점과 평균을 출력하세요.
		
		int korean=100;
		int english=100;
		int math=45;
		int score_sum = korean+english+math;
		double score_avg = (korean+english+math)/3.0;
		
		System.out.println("총점: " + score_sum);
		System.out.println("평균: "+score_avg);
		
		int sum=0;
		int aver = 0;
		sum=korean+english+math;
		aver=(int)(sum/3.0);
	}

}
