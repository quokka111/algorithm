package kking;

public class Test10 {

	public static void main(String[] args) {
		// 숫자 사각형
		// 4가 입력되면
		   /*1 2 3 4
           5 6 7 8
           9 10 11 12
           13 14 15 16*/
		
		int n = 5;
		
		int num = 1;
		
		
		
		for(int j = 0; j < n; j++){
			for(int i = 0; i < n; i++){
				System.out.printf("%4d", num);
				num++;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
