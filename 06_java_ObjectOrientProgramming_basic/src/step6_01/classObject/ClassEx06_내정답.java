package step6_01.classObject;
import java.util.*;
/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

/*
class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}
*/



public class ClassEx06_내정답 {

	public static void main(String[] args) {
		Ex06 e = new Ex06();
		Random rand = new Random();
		char[] gr = new char[5];
		// 난수 생성
		// rand.nextInt(5) + 1 ;  1~5
		for (int i = 0; i < e.answer.length; i++) {
			System.out.print("정 답 " + e.answer[i] + "   ");
		}
		System.out.println();
		for (int i = 0; i < e.hgd.length; i++) {
			e.hgd[i] = rand.nextInt(5)+1; // 랜덤 숫자 5개 저장
			if(e.hgd[i] == e.answer[i]) {
				gr[i] = 'O';
				e.answerCnt++;
			}
			else {
				gr[i] = 'X';
			}
			System.out.print("내 답 " + e.hgd[i] + "   ");
		}
		System.out.println();
		for(int i=0; i<gr.length; i++) {
			System.out.print(gr[i] + "  ");
		}
		System.out.println("\n성적 : " + e.answerCnt*20);
	}

}
