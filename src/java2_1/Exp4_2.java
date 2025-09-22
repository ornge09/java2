package java2_1;

public class Exp4_2 {

	public static void main(String[] args) {
		
		int[] maxmin = {12,45,3,67,22,90,15};
		int max = 0;
		
		
		for(int i = 0;i < maxmin.length;i++) {
			
			if(max < maxmin[i]) {
				
				max = maxmin[i];
				
			}
			
		}

		System.out.println("まくすうぇる" + max);
		
	}

}
