package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;

// # 파일에 저장
public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "ex01.txt";
		
		FileWriter fw = null;
		
		try {
			// 파일 입출력은 try, catch 없이 사용하지 못하게 강제성을 부여해 놓았다.
			fw = new FileWriter(fileName); // 파일 객체 생성
			fw.write("파일 저장하기 연습문제"); // 파일에 input
			
			fw.close();
			// 파일 기본적으로 생성되는 위치는 같은 프로젝트이다. ( 변경가능 )
			// 소스를 실행한 후 프로젝트를 선택한뒤 F5(Refresh)를 누르면 생성된 파일을 확인할 수 있다.
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
