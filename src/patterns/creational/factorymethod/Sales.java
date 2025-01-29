package patterns.creational.factorymethod;

// 具体产品
public class Sales implements Interviewer{
	
	@Override
	public void askQuestions() {
		System.out.println("请给出一个营销计划");
		
	}
}
