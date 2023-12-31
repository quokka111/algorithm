package kking;

import java.util.Arrays;

public class Test26 {

	public static void main(String[] args) {

		// 수를 거꾸로 읽기
		
		int a = 734;
		int b = 893;
		
		int arrA[] = new int[3];   // [0]=4, [1]=3, [2]=7 -> 437
		int arrB[] = new int[3];
		
		int lenA = 0;       // 새롭게 거꾸로 읽힌 수
		do{
			arrA[lenA] = a % 10;    // 734를 10으로 나눈 나머지를 arr[]배열에 넣는다.   734 % 1 = 4,  나머지 4가 arr[0]에 들어간다.
			a /= 10;                // 734를 10으로 나눈 몫 73을 새롭게 세팅한다.
			lenA++;                 // 배열자릿수를 1카운트 올린다.
			
		} while(a > 0);
		
		int tranA = 0;         // 변환시킬애를 저장할 변수
		                       // [0]=4, [1]=3, [2]=7 -> 437  현재 이렇게 배열로 들어가있기 때문에
		                       // 400 + 30 + 7 = 437 형태로 저장해야 한다.
		int mux = 1; 		   // 1 -> 10 -> 100 이렇게 곱하는 mux변수를 생성.
		
	//	System.out.println(Arrays.toString(arrA));
	//	System.out.println(arrA.length);
		
		for(int i = arrA.length-1; i >= 0; i--){
			tranA += arrA[i] * mux;
			mux*= 10;
		}
		
		System.out.println("tranA = " + tranA);
		
		
		int tranB = 0;
		
		int lenB = 0;       
		do{
			arrB[lenB] = b % 10;    
			b /= 10;               
			lenB++;                 
			
		} while(b > 0);
		
		int tranb = 0;         
		mux = 1; 		   
		
		for(int i = arrB.length-1; i >= 0; i--){
			tranB += arrB[i] * mux;
			mux*= 10;
		}
		
		System.out.println("tranB = " + tranB);
		
		if(tranA > tranB){
			System.out.println(tranA);
		}
		else{
			System.out.println(tranB);
		}
		
	}

}
