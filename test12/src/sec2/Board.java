package sec2;

public class Board {
	private String title;
	private String date;
	private String contents;
	private int visited;
	
	public Board() {}
	public Board(String title, String date, String contents, int visited) {
		super();
		this.title = title;
		this.date = date;
		this.contents = contents;
		this.visited = visited;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return "Board [title=" + title + ", date=" + date + ", contents=" + contents + ", visited=" + visited + "]";
	}
}
