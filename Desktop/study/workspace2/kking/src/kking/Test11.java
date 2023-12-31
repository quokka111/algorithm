package kking;

public class Test11 {

	public static void main(String[] args) {
		// 숫자 사각형2(행별로 숫자 반대로)
		
		// 4
		/*  1  2  3  4
		  8  7  6  5
		  9  10 11 12
		  16 15 14 13*/

		int n = 5;
		
		int arr[][] = new int[n][n];
		
		
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				for(int j = 0; j < n; j++){
					arr[i][j] = i * n + n + 1;
				}
			}
			else{
				for(int j = n - 1; j >= 0; j--){
					arr[i][j] = i * n + n - j; 
				}
			}
		}   
		
		
		
		
		
		
		
		
		
		
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
