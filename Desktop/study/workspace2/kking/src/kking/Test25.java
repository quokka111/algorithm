package kking;

public class Test25 {

	public static void main(String[] args) {

		int n = 26;
		int res = n;
		int tmp = 0;
		int cnt = 0;
		
		// 26 2+6 => 68, 6+8=14 => 82, 8+4=12=> 42, 4+2=6 => 26, 4회
		
	do{
		
		tmp = res / 10 + res % 10;
		res = res % 10 * 10 + tmp % 10;
		cnt++;
	} while(n != res);   // 처음수(n)와 마지막수(res)가 같지 않으면 계속 반복 
	
	
		System.out.println(cnt);
		
	}

}
