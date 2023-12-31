package kking;

public class Test7 {

	public static void main(String[] args) {
		// 입력된 수가 소수인지 판별
		
		
		int num = 13;
		
		boolean isPrimeNumber = true;
		
		for(int i = 2; i <= num -1; i++){
			if(num % i == 0){
				isPrimeNumber = false;
			}
		}
		if(isPrimeNumber){
			System.out.println(num + "은 소수입니다.");
		}
		else{
			System.out.println(num + "은 소수가 아닙니다.");
		}

	}

}
