package patterns.behavioral.templatemethod;

public class Main {
	//客户端代码
	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
		
		System.out.println();
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();

	}

}
