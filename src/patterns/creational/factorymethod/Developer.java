package patterns.creational.factorymethod;

public class Developer implements Interviewer{
	
	@Override
	public void askQuestions() {
		System.out.println("请说出10个设计模式。");		
	}
}
