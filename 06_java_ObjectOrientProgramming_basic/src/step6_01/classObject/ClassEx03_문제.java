package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

//class Ex03{
//	int[] arr = {87, 100, 11, 72, 92};
//}



public class ClassEx03_문제 {

	public static void main(String[] args) {
		
		Ex03 e_3 = new Ex03();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		for (int i = 0; i < e_3.arr.length; i++) {
			sum += e_3.arr[i];
		}
		System.out.println(sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		sum = 0;
		for (int i = 0; i < e_3.arr.length; i++) {
			if(e_3.arr[i] % 4 == 0) {
				sum += e_3.arr[i];
			}
		}
		System.out.println(sum);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int count = 0;
		for (int i = 0; i < e_3.arr.length; i++) {
			if(e_3.arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println(count);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		count = 0;
		for (int i = 0; i < e_3.arr.length; i++) {
			if(e_3.arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);


	}

}
