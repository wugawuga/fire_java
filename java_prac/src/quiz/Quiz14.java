package quiz;

import java.util.Arrays;

public class Quiz14 {

	public static void main(String[] args) {
		
		int[] arr = {4,4,4,4,4,3,3};
		int[] arrcopy = new int[arr.length];
        int cpInt = 10;
        int lgInt = 0;
        
         for(int i = 0; i < arr.length;i++){
             if(arr[i] != cpInt){
            	 arrcopy[lgInt++] = arr[i];
            	 cpInt=arr[i];
             }
         }
        int[] answer = new int[lgInt];
        for(int i = 0; i<answer.length;i++){
             answer[i] = arrcopy[i];
         }
        System.out.println(Arrays.toString(answer));
	}

}
