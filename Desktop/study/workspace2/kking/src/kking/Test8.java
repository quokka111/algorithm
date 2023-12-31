package kking;

public class Test8 {

	public static void main(String[] args) {
		// 입력된 수의 팩토리얼
		
		
		int inputNum = 5;
		int accNum = 1;   // 0으로 초기화하면 곱한값이 0이 되어서 팩토리얼 계산이 안된다.
		
		for(int i = 1; i <= inputNum; i++){
			accNum *= i; // accNum = accNum * i;
		}
		
		System.out.println(accNum);
		
		

	}

}
