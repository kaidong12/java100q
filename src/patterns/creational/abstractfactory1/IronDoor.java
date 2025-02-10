package patterns.creational.abstractfactory1;

// 具体产品1
public class IronDoor  implements Door{
	
	@Override
	public void getDescription() {
		System.out.println("我是一个铁门！！");
	}

}
