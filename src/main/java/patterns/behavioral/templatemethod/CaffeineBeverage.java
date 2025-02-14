package patterns.behavioral.templatemethod;

//抽象类（Abstract Class）：定义了模板方法和一些基本操作。
//模板方法是一个具体方法，它定义了算法的骨架，调用其他抽象方法或具体方法。
public abstract class CaffeineBeverage {

	// 模板方法，定义了算法的骨架
	final void prepareRecipe() {
        boilWater();          // 1. 烧水
        brew();               // 2. 泡制饮料
        pourInCup();          // 3. 倒入杯子
        if (customerWantsCondiments()) { // 钩子方法
            addCondiments();  // 4. 添加调料
        }
	}

//	抽象方法（Abstract Methods）：在抽象类中声明的抽象方法，子类必须实现这些方法。
	abstract void brew();
//	抽象方法（Abstract Methods）：在抽象类中声明的抽象方法，子类必须实现这些方法。
	abstract void addCondiments();

//	具体方法（Concrete Methods）：在抽象类中定义的具体方法，这些方法通常在子类中不需要被覆盖。
	void boilWater() {
		System.out.println("Boiling water.");
	}

//	具体方法（Concrete Methods）：在抽象类中定义的具体方法，这些方法通常在子类中不需要被覆盖。
	void pourInCup() {
		System.out.println("Pour into cup.");
	}

//	钩子方法（Hook Methods）：在抽象类中定义的可选方法，子类可以选择性地覆盖这些方法以扩展或修改模板方法的行为。
	boolean customerWantsCondiments() {
        return true;
    }

}
