package sec2;

public class LombokExam1 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("jdj");
		mem1.setPw("1234");
		mem1.setPoint(50);
		System.out.println(mem1.toString());
		
		Board b1 = new Board();
		b1.setBno(1);
		b1.setTitle("집으로");
		b1.setContents("집에 가면 쉬어야지");
		b1.setViewCnt(1000);
	}
}
