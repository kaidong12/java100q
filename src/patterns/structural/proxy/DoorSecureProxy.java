package patterns.structural.proxy;

//代理主题（Proxy Subject）
public class DoorSecureProxy implements Door{
	private Door door;
	
	public DoorSecureProxy(Door door) {
		this.door = door;
	}
	
	@Override
	public void open(String password) {
		if (authenticate(password)) {
			door.open("null");
		}else {
			System.out.println("Password incorrect!\n");
		}
	}
	
	private boolean authenticate(String password) {
		return "password".equals(password);
	}
	
	@Override
	public void close() {
		System.out.print("Turn off lights first! ");
		door.close();
	}
}
