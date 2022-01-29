package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz21 {

	public static void main(String[] args) {
		
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		// 3,4,2,1,5 int [] answer;
		int length = stages.length;
		
		double faildap = 0;
		Arrays.sort(stages);
		Map<Integer, Double> map = new HashMap<>();
		for(int i=1;i<=N;i++) {
			int failpeople = 0; // 실패 카운트
			for(int j=0;j<stages.length;j++) {
				// 스테이지 == 풀고있는 단계 -> 실패 카운트 증가
				if(i == stages[j]) {
					failpeople++;
				}
			}
			if(failpeople == 0) {
				map.put(i, (double)0);
				continue;
			}
			faildap = (double)failpeople/length;
			map.put(i, faildap);
			length -= failpeople;
		}
		List<Integer> key = new ArrayList<Integer>(map.keySet());
		Collections.sort(key, (d1, d2)->(map.get(d2).compareTo(map.get(d1))));
		
		int[] answer = new int[key.size()];
		for(int i=0;i<key.size();i++) {
			answer[i] = key.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}












