package kking;

public class Test5 {

	public static void main(String[] args) {
		// 대문자는 소문자로, 소문자는 대문자로
		
		String input = "helloWorlD";
		char[] arr;
		arr = input.toCharArray();    // toCharArray : 문자열을 char형 배열로 변환("ABCD" -> 'A', 'B', 'C', 'D')
		System.out.println(arr);
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= 'a' && arr[i] <= 'z'){
				arr[i] = (char)(arr[i] + ('A'-'a'));
			}
			else if(arr[i] >= 'A' && arr[i] <= 'Z'){
				arr[i] = (char)(arr[i] - ('A'-'a'));
			}
		}
		
		System.out.println(arr);

	
	
	}
	
	
	
	
	
	

}
