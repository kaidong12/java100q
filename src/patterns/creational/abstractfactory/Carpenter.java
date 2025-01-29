package patterns.creational.abstractfactory;

// 具体产品2
public class Carpenter implements FittingExpert{

	@Override
	public void getDescription() {
		System.out.println("我是一个木工，让我来安装木门！");
	}
}
