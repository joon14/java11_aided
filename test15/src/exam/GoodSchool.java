package exam;

class Student {
	private int no;
	private String studentName;
	private Subject subject;  //Subject subject
	
	public Student() {}
	public Student(int no, String studentName, Subject subject) {
		super();
		this.no = no;
		this.studentName = studentName;
		this.subject = subject;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", studentName=" + studentName + ", subject=" + subject + "]";
	}
}

class Subject {
	private int code;
	private String style;
	private String subjectName;
	
	public Subject() {}
	public Subject(int code, String style, String subjectName) {
		super();
		this.code = code;
		this.style = style;
		this.subjectName = subjectName;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	@Override
	public String toString() {
		return "Subject [code=" + code + ", style=" + style + ", subjectName=" + subjectName + "]";
	}
}

class Score {
	private int no;
	private Subject subject;
	private int point;
	
	public Score() {}
	public Score(int no, Subject subject, int point) {
		super();
		this.no = no;
		this.subject = subject;
		this.point = point;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Score [no=" + no + ", subject=" + subject + ", point=" + point + "]";
	}
}

public class GoodSchool {
	public static void main(String[] args) {

	}
}
