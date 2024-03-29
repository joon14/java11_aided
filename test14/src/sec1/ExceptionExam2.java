package sec1;
//NullPointerException : 출력할 문장이 있는 기억장소가 비어있는 경우 발생
public class ExceptionExam2 {
	public static void main(String[] args) {
		String name = null;
		//실제 처리할 문장(try)이 예외가 발생하면, 예외 처리 문장(catch)을 실행
		//다중 catch 문장
		try {
			//실제 처리할 문장
			System.out.println(name.toString());	
			System.out.println("정상처리 문장 아래");
		} catch(NullPointerException e) {
			e.printStackTrace();
			name = "jdj";
			System.out.println(name+"\n예외처리 문장 아래");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생하였습니다.");
		}
	}
}
