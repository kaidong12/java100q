package patterns.structural.proxy;

//真实主题（Real Subject）
public class UserServiceReal implements UserService {

	@Override
	public void addUser(String username, String password) {
		System.out.println("添加用户：" + username + ", 密码：" + password);

	}

	@Override
	public void deleteUser(String username) {
		System.out.println("删除用户：" + username);

	}

}
