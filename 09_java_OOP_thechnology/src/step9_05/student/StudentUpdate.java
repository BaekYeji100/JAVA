package step9_05.student;

import java.util.Scanner;

//Service : 데이터 변경 로직

public class StudentUpdate {
	Scanner scan = new Scanner(System.in);
	private StudentDAO studentDAO;
	
	public StudentUpdate(StudentDAO std) {
		this.studentDAO = std;
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		
		return studentVO != null? true:false;
	}
	
	public void update(String id) {
		if(checkId(id)) {
			
			StudentVO studentVO = studentDAO.select(id);
			
			System.out.print(id+"님의 바꾸실 이름을 입력하세요 : ");
			String name = scan.next();
			System.out.print(id+"님의 바꾸실 번호를 입력하세요 : ");
			int num = scan.nextInt();
			
			studentDAO.update(studentVO, name, num);
			
		}else {
			System.out.println("입력하신 아이디의 회원정보가 없습니다.");
		}
	}
}
