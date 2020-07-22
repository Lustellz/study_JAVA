package kosta.data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한쌍으로 한 Map 자료구조를 구현해 보세요.
		// ex) 프람: 80, 자이라: 90
		//시험응시자(key)->keySet()
		//점수(value_->values: Collection -> Iterator
		//총점과 평균, 최고점수와 최저점수를 출력해 보세요.
		Map<String, Integer> scores = new HashMap<String,Integer>();
		scores.put("프람",80);
		scores.put("자이라", 90);
		scores.put("헬가", 150);
		scores.put("루실리카", 85);
		scores.put("바네사", 80);
		
		System.out.println(scores.entrySet());
		Iterator<Integer> score_itr = (scores.values()).iterator();
		int s_sum=0;
		while(score_itr.hasNext())
			s_sum +=(int)score_itr.next();
		double s_avg = s_sum/scores.size();
		
		System.out.println("합계: "+s_sum+" 평균: "+s_avg);
		System.out.println("최고 점수: "+Collections.max(scores.values()));
		System.out.println("최저 점수: "+Collections.min( scores.values()));
	}

}
