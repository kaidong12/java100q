package patterns.behavioral.observer;

// 可观察接口
public interface Observerable {
	void attach(Observer observer);
	void detach(Observer observer);
	void notifyObservers(JobPost job);
}
