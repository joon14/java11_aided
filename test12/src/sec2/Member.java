package sec2;

public class Member {
	private int num;
	private String name;
	private String id;
	private String pw;
	
	public Member() {}
	public Member(int num, String name, String id, String pw) {
		super();
		this.num = num;
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", id=" + id + ", pw=" + pw + "]";
	}
}
