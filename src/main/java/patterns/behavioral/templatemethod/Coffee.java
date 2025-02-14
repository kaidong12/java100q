package patterns.behavioral.templatemethod;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter.");

	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk.");

	}
	
	// 覆盖钩子方法
    @Override
    boolean customerWantsCondiments() {
        return getUserInput().equalsIgnoreCase("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
        answer = new Scanner(System.in).nextLine();
        return answer;
    }

}
