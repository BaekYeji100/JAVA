package step6_02.method;


class Ex10{
	
	int test1(int[] arr) { 
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]  % 4 == 0 ) {
				result++;
			}
		}
		return result; }
	
	int[] test2(int[] arr) { 	
		int cnt = test1(arr);
		int result[] = new int[cnt];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 ==0) {
				result[j] = arr[i];
				j++;
			}
		}
		return result;
	}
}



public class MethodEx10_내정답 {

	public static void main(String[] args) {
		
		
			Ex10 e = new Ex10();
			
			int[] arr = {87, 12, 21, 56, 100};
			
			// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
			System.out.println(e.test1(arr));
			
			// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고(3), 4의 배수를 저장후 배열을 리턴해주는 메서드
			int[] temp = e.test2(arr);
			for (int i = 0; i < temp.length; i++) {
				System.out.println(temp[i]);
			}

	}

}
