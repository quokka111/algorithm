package kking;

import java.util.Scanner;

public class Test31 {

	// 재귀함수는 탈출조건 중요
	
	public static int calFact(int i ){
		
		if( i == 1){
			return 1;
		}
		
		return i * calFact(i-1);
		
	}
	
	
	public static void main(String[] args) {

		int input;
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		int ans = 0;
		
		ans = calFact(input);
		
		
		
		
		System.out.println(ans);
		
		
		
		
	}

}
