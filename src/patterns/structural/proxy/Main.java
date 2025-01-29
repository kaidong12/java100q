package patterns.structural.proxy;

//客户端代码
public class Main {
	public static void main(String[] args) {
		DoorSecureProxy sdoor = new DoorSecureProxy(new DoorLabReal());
		sdoor.open("123456");
		sdoor.open("password");
		sdoor.close();
		
		System.out.println();
		UserService userService = new UserServiceProxy(); // 创建代理对象
        userService.addUser("Alice", "123456"); // 通过代理对象调用方法
        userService.deleteUser("Alice");
	}
}
