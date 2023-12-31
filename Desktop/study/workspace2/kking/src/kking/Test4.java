package kking;

public class Test4 {
	public static void main(String[] args){
		// 10진수를 2진로 변경
		
		int inputNum = 19;
		int bin[] = new int[100];
		
		
		/*10진수 2진수 만들기
		
		19 / 2  9...1
		9  / 2  4...1
		4  / 2  2...0
		2  / 2  1...0
		1  / 2  0...1
		
		10011 -> 19*/
		
		int i = 0;
		int mok = inputNum;
		
		while(mok > 0){
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--;  // i카운트 하나 올라가면 010011나오기 때문에 i-- 삽입
		
		for(; i>=0; i--){
			System.out.print(bin[i]);
		}
		
		
		
		
	}

}
