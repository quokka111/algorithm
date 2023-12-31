package kking;

public class Test23 {

	public static void main(String[] args) {
		// 문자열 뒤집기
		
		String n = "ADEFH";   // -> HFEDA
	    char str[] = n.toCharArray();    // 글자로 나누기
	    char tmp;
	    
	    int len = str.length;
	    
	    for(int i = 0; i < len/2; i++){
	    	tmp = str[i];
	    	str[i] = str[len-i-1];
	    	str[len-i-1] = tmp;
	    }
		
		n = new String(str);     // char형을  String형으로 변환
		
		System.out.println(n);
	

	}

}
