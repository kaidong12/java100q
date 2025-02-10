package patterns.creational.abstractfactory1;

// 具体产品2
public class Welder implements FittingExpert{

	@Override
	public void getDescription() {
		System.out.println("我是焊工，让我来安装铁门！！");
	}
}
