package patterns.structural.proxy;

//抽象主题（Subject）
public interface UserService {
    void addUser(String username, String password);
    void deleteUser(String username);
}
