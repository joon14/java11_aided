package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionExam8 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;
		
		try {
			fis = new FileInputStream("indata.txt");
			try {
				ois = new FileOutputStream("outdat.txt");
			} catch(FileNotFoundException e1) {
				System.out.println("ois의 해당 파일을 찾을 수 없습니다.");
			}		
		} catch (FileNotFoundException e) {
			System.out.println("fis의 해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();	
			try {
				ois = new FileOutputStream("outdat.txt");
			} catch(FileNotFoundException e1) {
				System.out.println("ois의 해당 파일을 찾을 수 없습니다.");
			}
		} catch(Exception e) {
			System.out.println("원인 불명");
			e.getMessage();
		} finally {
			System.out.println("파일 처리 종료");
		}
	}
}
