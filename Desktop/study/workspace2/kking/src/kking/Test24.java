package kking;

public class Test24 {

	public static void main(String[] args) {

		int in[] = {7, 100, 95, 90, 80, 70, 60, 50};
		
		int sum = 0;
		
		for(int i = 1; i <in.length; i++){
			sum += in[i];
		}
		
		
		double avg = (double)sum / in[0];
		
		System.out.println(avg);
		
		int cnt = 0; // 평균보다 높은 사람들의 수를 저장하는 count변수
		
		for(int i = 1; i < in.length; i++){
			if(in[i] > avg){
				cnt++;
			}
		}
		
		System.out.println((double)cnt /in[0] * 100);  //  평균보다 높은사람 / 학생 수 * 100
		
		
	}

}
