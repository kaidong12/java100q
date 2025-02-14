package patterns.creational.factorymethod;

// 具体创建者
public class SalesManager extends HiringManager{

	@Override
	protected Interviewer makeInterviewer() {
		return new Sales();
	}
}
