package kking;

public class Test6 {

	public static void main(String[] args) {
		// 입력된 두 수의 최대공약수

		int num1, num2;
		num1 = 12;
		num2 = 18;
		
		int small;
		int big;
		
		if(num1 > num2){
			big = num1;
			small = num2;
		} 
		else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; // 최대공약수 1로 초기화
		
		for(int i = 1; i <= small; i++){
			if(big % i == 0 && small % i == 0)
				gcd = i;
		}
		System.out.println(gcd);
		
	}

}
