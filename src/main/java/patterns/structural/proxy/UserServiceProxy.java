package patterns.structural.proxy;

//代理主题（Proxy Subject
public class UserServiceProxy implements UserService {

	private UserService realUserService;
	
	@Override
	public void addUser(String username, String password) {
        preRequest(); // 在调用真实方法之前执行的逻辑
        if (realUserService == null) {
            realUserService = new UserServiceReal();
        }
        realUserService.addUser(username, password); // 调用真实对象的方法
        postRequest(); // 在调用真实方法之后执行的逻辑

	}

	@Override
	public void deleteUser(String username) {
		preRequest();
        if (realUserService == null) {
            realUserService = new UserServiceReal();
        }
        realUserService.deleteUser(username);
        postRequest();

	}
	
    private void preRequest() {
        System.out.println("代理：在执行请求之前进行身份验证和日志记录");
    }

    private void postRequest() {
        System.out.println("代理：在执行请求之后进行日志记录和清理工作");
    }

}
