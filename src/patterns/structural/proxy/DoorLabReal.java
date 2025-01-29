package patterns.structural.proxy;

//真实主题（Real Subject）
public class DoorLabReal implements Door{
	@Override
	public void open(String param) {
		System.out.println("Opening the lab door");
	}
	
	@Override
	public void close() {
		System.out.println("Closing the lab door");
	}

}
