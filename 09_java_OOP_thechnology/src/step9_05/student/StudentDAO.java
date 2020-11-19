package step9_05.student;

import java.util.Map;

// DAO ( Data Access Object ) : DB로부터 데이터를 input ouput하는 객체
public class StudentDAO {
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		// 배열 arr[0];
		// 어레이리스트 arrList.get(0);
		// 맵.get(키값);
		return StudentRepository.getStDB().get(id);
	}
	
	
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}
	
	
	//remove
	public void delete(String id) {
		StudentRepository.getStDB().remove(id);
	}
	
	// update
	public void update(StudentVO st,String name, int num) {
		
		StudentRepository.getStDB().put(st.getId(), new StudentVO(st.getId(),num,name));
		
	}

}
