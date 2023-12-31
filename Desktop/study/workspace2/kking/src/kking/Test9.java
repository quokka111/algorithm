package kking;

public class Test9 {

	public static void main(String[] args) {
		// 각 자릿수 합 구하기
		
		int inputNum = 5232;
		int accSum = 0;

		// 1232 -> 123 -> 12 -> 1
		//   2      3     2     1   -> 합은 8
		
		
		while(inputNum > 0){
			accSum += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(accSum);
		
		
		

	}

}
