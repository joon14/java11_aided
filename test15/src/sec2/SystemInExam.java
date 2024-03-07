package sec2;

import java.io.IOException;
//키보드로 한 글자 입력하여 라인단위 입력하여 출력
public class SystemInExam {
	public static void main(String[] args) {
		System.out.println("영문 한 글자를 데이터를 입력하고, [Enter]를 누르세요!");
		int i;
		try {
			i = System.in.read();	//아스키코드 한 글자 입력 => 바이트 단위 입력
			System.out.println(i);
			System.out.println("입력된 문자 : "+((char) i));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
