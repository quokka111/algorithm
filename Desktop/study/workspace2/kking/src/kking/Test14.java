package kking;

public class Test14 {

	public static void main(String[] args) {
		// 입력된 숫자의 개수를 출력
		
		
		int n = 421314218;
		
		int arr[] = new int[10]; // 0 ~9 입력된 수를  cnt 위한 용도
		

		while(n > 0){
			arr[n % 10]++;
			n /= 10;
			
		}
		
		
		
		
		for(int i = 0; i < 10; i++){
			System.out.println(i + ": " + arr[i]);
		}
		
		
		
		

	}

}
