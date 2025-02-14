package patterns.creational.factorymethod;

// 具体创建者
public class DevelopmentManager extends HiringManager{

	@Override
	protected Interviewer makeInterviewer() {
		return new Developer();
	}
	
}
