package kking;

public class Test18 {

	public static void main(String[] args) {
		// 별 출력 3
		
		int n = 5;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i < n - (j + 1))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		

	}

}
