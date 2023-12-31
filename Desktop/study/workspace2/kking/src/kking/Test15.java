package kking;

public class Test15 {

	public static void main(String[] args) {
		// 구구단 s부터 f단까지 입력받아 출력
		
		 int s = 2;
		 int f = 5;
		 
		// 2단부터 5단까지 출력
		 
		 for(int i = 1; i <= 9; i++){
			 for(int dan = s; dan <= f; dan++){
				 System.out.printf("%2d * %2d = %3d", dan, i, dan* i);
			 }
			 System.out.println();
		 }
		
		
		
		
		
		

	}

}
