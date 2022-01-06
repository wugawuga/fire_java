package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int answer = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        int n = sc.nextInt();
        while(true){
            if(n<3){
            	temp.add(n); break;
        	}
            temp.add(n%3);
            n = n/3;
        }
        for(int i=0; i<temp.size(); i++){
            answer += (Math.pow(3,temp.size()-i-1)*temp.get(i));
        }
        
        System.out.print(answer);
	}

}
