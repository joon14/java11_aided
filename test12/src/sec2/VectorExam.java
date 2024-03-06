package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		//글쓰기
		nVector.add(new Notice("Title1", "Contents1", "Author1"));	//추가
		nVector.add(new Notice("Title2", "Contents2", "Author2"));
		nVector.add(new Notice("Title3", "Contents3", "Author3"));
		nVector.add(new Notice("Title4", "Contents4", "Author4"));
		nVector.add(new Notice("Title5", "Contents5", "Author5"));
		nVector.add(new Notice("Title6", "Contents6", "Author6"));
		
		//글목록
		System.out.println("********** Before **********");
		System.out.println("Title\tContents\tAuthor");
		for(Notice n:nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContents()+"\t"+n.getAuthor());
		}
		
		nVector.remove(3);	//인덱스가 3인 인스턴스 제거
		Notice no = new Notice("Title_N", "Contents_N", "Author_N");
		nVector.set(4, no);	//인스턴스를 인덱스가 4인 중간에 삽입
		System.out.println("\n********** After **********");
		System.out.println("Title\tContents\tAuthor");
		for(int i=0; i<nVector.size(); i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContents()+"\t"+n.getAuthor());
		}
	}
}
