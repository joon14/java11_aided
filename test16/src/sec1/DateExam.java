package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date date1 = new Date();
		@SuppressWarnings("deprecation")
		Date date2 = new Date(98,0,4,5,30,30);	//월(month)은 0부터 시작한다.(0 : 1월 ~ 11 : 12월)
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Mon, 02 Apr 2001 03:48:27 +0900");	//+0900 : RFC 822 규격 타임존
		//지역 이름(Global/Local) : KST, RFC 822 : +0900
		//국가 코드 : KR, 언어 코드 : KO => KO_KR
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("\n********* LocalDate *********");
		
		LocalDate now1 = LocalDate.now();
		System.out.println("날짜 데이터 : "+now1);	//날짜 데이터
		//날짜 데이터 => 문자열 데이터
		String now2 = now1.toString();
		System.out.println("날짜 데이터 -> 문자 데이터 : "+now2);
		//문자열 데이터 => 날짜 데이터
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println("문자 데이터 -> 날짜 데이터 : "+now3);
	}
}
