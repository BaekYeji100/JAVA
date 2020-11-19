package step9_05.student;

//Service : 데이터 변경 로직

public class StudentDelete {
	private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null? true:false;
	}
	
	public void delete(String id) {
		if(checkId(id)) {
			studentDAO.delete(id);
		}
		else {
			System.out.println("입력하신 아이디의 회원정보가 없습니다.");
		}
	}
}
