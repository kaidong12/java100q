package patterns.creational.factorymethod;

public class DevelopmentManager extends HiringManager{

	@Override
	protected Interviewer makeInterviewer() {
		return new Developer();
	}
	
}
