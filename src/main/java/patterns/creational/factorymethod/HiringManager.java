package patterns.creational.factorymethod;

// 创建者（抽象类）
public abstract class HiringManager {
	// 工厂方法--抽象方法
	protected abstract Interviewer makeInterviewer();
	
	// 入口
	// 通过此方法调用工厂方法创建具体产品
	// 然后，调用与此具体产品对应的具体方法(askQuestions)
	public void takeInterview() {
		Interviewer interviewer = makeInterviewer();
		interviewer.askQuestions();
		
	}

}
