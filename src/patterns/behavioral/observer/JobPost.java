package patterns.behavioral.observer;

// 被观察物（消息）
public class JobPost {
	private String title;
	
	public JobPost (String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
}
