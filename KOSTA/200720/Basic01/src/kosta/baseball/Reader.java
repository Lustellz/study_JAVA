package kosta.baseball;

public class Reader {

	private int guess[]=new int[3];

	public int[] getGuess() {
		return guess;
	}

	public void setGuess(int guess[]) {
		this.guess = guess;
	};

	Reader(){};
	
	Reader(String guess){
		for(int i=0;i<3;i++)
			this.guess[i]=Integer.parseInt(guess.substring(i, i+1));
	}
}
