package kosta.baseball;

import java.util.Random;

public class Answer {

	private int ans[]=new int[3];
	
	Answer(){
		Random r = new Random();

		do {
			
			this.ans[0]=(int) (r.nextInt(10)+1);
			this.ans[1]=(int) (r.nextInt(10)+1);
			this.ans[2]=(int) (r.nextInt(10)+1);
		}while(this.ans[0]==this.ans[1]||this.ans[1]==this.ans[2]||this.ans[2]==this.ans[0]||this.ans[0]==10||this.ans[1]==10||this.ans[2]==10);
	};
	
	public int[] getAns() {
		return this.ans;
	}
}
