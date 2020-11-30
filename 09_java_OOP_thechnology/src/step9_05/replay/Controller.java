package step9_05.replay;

public class Controller {
	
	private StudentDAO stDAO;
	
	public Controller() {
		stDAO = new StudentDAO();
	}

	public StudentDAO getStDAO() {
		return stDAO;
	}

	public void setStDAO(StudentDAO stDAO) {
		this.stDAO = stDAO;
	}
	
	

}
