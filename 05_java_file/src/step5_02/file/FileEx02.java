package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileEx02 {
	public static void main(String[] args) {
		String fileName = "ex01.txt";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String data = "";
				while (true) {
					String temp = br.readLine(); // 한줄 읽어오는 메소드
					
					if (temp == null)
						break;
					
					data += temp;
				}
				
				System.out.println(data);
				
				br.close();
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
