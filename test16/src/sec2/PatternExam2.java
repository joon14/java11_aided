package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {
	public static void main(String[] args) {
		String[] email = {"jdj104","jdj104@naver.com","jdj104@gmail","jdj@kr","jdj@daum.net"};
		Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$");	//이메일 형식에는 대문자 사용X, +$ : 추가되는 조건이 더이상 없음을 의미
		//Pattern p1 = Pattern.compile("\\w+@\\w+\\.\\w+(\\\\.\\\\w+)?");
		
		for(int i=0;i<email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("맞는 이메일 입니다.");
				System.out.println(email[i]);
			}
		}
		
		System.out.println();
		
		String[] phone = {"12345678","1234-5678","02-1234-5678","02123-45678","0708-00005-6546"
				,"010-1234-5678","010-555-4444"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");
		//Pattern p2 = Pattern.compile("01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$");
		
		for(int i=0;i<phone.length;i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("맞는 휴대폰 번호 입니다.");
				System.out.println(phone[i]);
			}
		}
		
		System.out.println();
		
		String[] jm = {"12345678","882234-5675558","990810-1001235","000123-4045678","0708-00005-6546"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		//Pattern p3 = Pattern.compile("\\d{2}[0-1][1-9][0-3][0-9]\\-[1-4]\\d{6}");
		
		for(int i=0;i<jm.length;i++) {
			Matcher m = p3.matcher(jm[i]);
			if(m.matches()) {
				System.out.println("맞는 주민등록번호 입니다.");
				System.out.println(jm[i]);
			}
		}
		
		System.out.println();
		
		String[] post = {"123-45","1234-5678","99-0810-10","03-478","078-06","855-55","745-88"};
		//우편번호 패턴 : 100번대(1xx-yy)~700번대(7xx-yy)
		//Pattern p4 = Pattern.compile("^\\d{3}-\\d{2}$");
		//Pattern p4 = Pattern.compile("\\d{3}\\-\\d{2}");
		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");
		
		for(int i=0;i<post.length;i++) {
			Matcher m = p4.matcher(post[i]);
			if(m.matches()) {
				System.out.println("맞는 우편번호 입니다.");
				System.out.println(post[i]);
			}
		}
		
		System.out.println();
		
		String[] pw = {"abcd1234","A123a","1234","ABCD!123456","Abc!432","JUNG!432"};
		//비밀번호 패턴 : 4~10 글자로 영문 대/소문자와 특수문자(!@#$%^&*?_) 그리고 숫자를 모두 최소 1문자를 포함
		//() 반드시 포함
		//? 한 문자
		//=. 이상
		//* 뒤에 나오는 조건으로
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}");
		for(int i=0;i<pw.length;i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches()) {
				System.out.println("영문 대문자, 소문자, 숫자, 특수문자가 모두 포함된 맞는 비밀번호 입니다.");
				System.out.println(pw[i]);
			}
		}
	}
}
