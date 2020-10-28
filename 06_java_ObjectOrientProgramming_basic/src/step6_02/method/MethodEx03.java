package step6_02.method;
/*
 * return 
 *  1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드 1개당 return 값은 1개이다.
 *  
 */
class Student3{
	void setScore1(int score1) {
		score1 = 100;
		
	}
	
	int setScore2(int score2) {
		score2 =100;
		return score2;
	}
	
	int testReturn() {
		System.out.println("리턴 전 명령어 1 ");
		System.out.println("리턴 전 명령어 2 ");
		System.out.println("리턴 전 명령어 3 ");
		
		return 1;
		// return 1,2,3,4,5; // 복수의 리턴값 불가능
		// 불가능
//		System.out.println("리턴 후 명령어 1 ");
//		System.out.println("리턴 후 명령어 2 ");
//		System.out.println("리턴 후 명령어 3 ");
	}
}

public class MethodEx03 {
	public static void main(String[] args) {
		Student3 std3 = new Student3();
		
		int score1 = 47;
		System.out.println("메소드 호출전의 성적 : " + score1);
		
		std3.setScore1(score1);
		System.out.println("메소드 호출후의 성적 : " + score1);
		
		int score2 = 47;
		System.out.println("메소드 호출전의 성적 : " + score2);
		
		int result = std3.setScore2(score2);
		System.out.println("메소드 호출후의 성적 : " + result);
		
	}
}
