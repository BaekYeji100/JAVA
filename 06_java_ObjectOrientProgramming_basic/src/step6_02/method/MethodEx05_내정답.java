

package step6_02.method;



class Ex05{

	void test1() {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	void test2(int a, int b, int c) {
		int max = a;
		int max_2 = 0;
		if(b > c) {
			max_2 = b;
		}
		else {
			max_2 = c;
		}
		
		if(max > max_2) {
			
		}
		else {
			max = max_2;
		}
		
		System.out.println(max);
	}
	
}


public class MethodEx05_내정답 {

	public static void main(String[] args) {

		
			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 입력받아 최대값을 출력하는 메서드
			e.test2(1,2,3);
		

	}

}
