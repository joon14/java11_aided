package sec2;

public class Notice {
	private String title;
	private String contents;
	private String author;
	
	public Notice() {}
	public Notice(String title, String contents, String author) {
		super();
		this.title = title;
		this.contents = contents;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Notice [title=" + title + ", contents=" + contents + ", author=" + author + "]";
	}
}
