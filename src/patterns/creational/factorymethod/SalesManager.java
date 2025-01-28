package patterns.creational.factorymethod;

public class SalesManager extends HiringManager{

	@Override
	protected Interviewer makeInterviewer() {
		return new Sales();
	}
}
