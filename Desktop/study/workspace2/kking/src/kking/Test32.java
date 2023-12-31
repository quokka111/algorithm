package kking;

import java.util.Scanner;

public class Test32 {

	// 1 4 => 1 + 2 + 3 + 4 = 10
	
	
	// 재구함수는 탈출조건 필수 
	public static int calAccSum(int start, int end){
		
		if(start == end){
			return start;
		}
		
	
	    return start + calAccSum(start + 1, end);
	}
	
	public static void main(String[] args) {
	
		int start;
		int end;
	    Scanner scan = new Scanner(System.in);
	    
	    start = scan.nextInt();
	    end = scan.nextInt();
	    
	    int ans = 0;
	    
	    ans = calAccSum(start, end);
	    
	    System.out.println("acc sum = " + ans);

	}

}
