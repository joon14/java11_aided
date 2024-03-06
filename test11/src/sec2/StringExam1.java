package sec2;

public class StringExam1 {
	public static void main(String[] args) {
		String name1 = "jdj";
		String name2 = new String("jdj");
		
		Integer num1 = 1004;
		String num2 = "1004";
		//String num3 = new String(num1);
		String num3 = String.valueOf(num1);	//★ 문자열 변경
		
		System.out.println("num1 equals num2 : "+num1.equals(num2));
		System.out.println("num2 equals num3 : "+num3.equals(num2));	//★ 문자열 및 객체 비교
		
		System.out.println();
		
		String str = "Kang/Park/Lee/Cho/Bae/Kwon";
		System.out.println("str : "+str);
		
		String names[] = new String[6];
		names = str.split("/");			//★ 문자열 분리
		System.out.println("\n****** split ******");
		for(String s:names) {
			System.out.println(s);
		}
		
		String str2 = String.join("/", names);	//★ 문자열 합치기
		System.out.println("\n****** join ******");
		System.out.println(str2);
		System.out.println();
		
		String data = "   ivE\'s beaUty grOup\nnewJeans is girlGroup Top    ";
		
		char ten = data.charAt(9);			//10번째 문자(인덱스가 9인 문자)
		System.out.println("10번째 문자(인덱스가 9인 문자) : "+ten);
		
		String trimData = data.trim();		//앞 뒤의 공백을 제거하여 trimData 에 저장
		System.out.println("앞 뒤의 공백을 제거 : "+trimData.length()+"글자, "+trimData);
		
		//int size = data.length();		
		int size = data.trim().length();	//글자수를 size 에 저장
		System.out.println("앞 뒤 공백을 제거한 글자 수 : "+size);
		
		int n1 = data.indexOf('n');			//첫 번째 n 의 글자 위치(인덱스)를 n1 에 저장
		System.out.println("첫 번째 n의 글자 위치(인덱스)를 n1에 저장 : "+n1);
		int n2 = data.lastIndexOf('n');		//마지막 n 의 글자 위치(인덱스)를 n2 에 저장
		System.out.println("마지막 n의 글자 위치(인덱스)를 n2에 저장 : "+n2);
		
		String up = data.toUpperCase();		//모두 대문자로 변환하여 up 에 저장
		System.out.println("모두 대문자로 변환하여 up 에 저장 : "+up);
		String down = data.toLowerCase();	//모두 소문자로 변환하여 down 에 저장
		System.out.println("모두 대문자로 변환하여 down 에 저장 : "+down);
		
		String sub1 = data.substring(22, 30);	//★ 공백을 제거하고, 22번째 글자부터 29번째만 추출하여 sub1에 저장
		System.out.println("공백을 제거하고, 22번째 글자부터 29번째만 추출하여 sub1에 저장 : "+sub1);
		
		String sub2 = data.replace("newJeans", "Kepler");	//newJeans의 단어를 Kepler로 변경하여 sub2에 저장
		System.out.println("newJeans의 단어를 Kepler로 변경하여 sub2에 저장 : "+sub2);
		
		byte girl[] = data.trim().getBytes();	//★ 문자열을 girl 문자배열로 변환하여 저장
		System.out.println("글자 수 : "+girl.length);
		for(byte b:girl) {
			char k = (char) b;
			System.out.println(k);
		}
		
		System.out.println();
		//girl 의 g의 마지막 위치부터 9문자를 추출하여 저장
		String girlgroup = data.substring(data.lastIndexOf('g'),data.lastIndexOf('g')+9);
		girlgroup = girlgroup + " " + sub1;
		System.out.println("girlgroup : "+girlgroup);
		
		//문자(byte)배열을 문자열(String)으로 변환 출력
		String str4 = new String(girl);
		System.out.println(str4);
	}
}
