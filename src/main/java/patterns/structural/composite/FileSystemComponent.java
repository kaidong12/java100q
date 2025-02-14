package patterns.structural.composite;

//组件接口（Component）：定义了组合中对象的行为，包括单个对象和组合对象的共同行为。
public interface FileSystemComponent {
    void display(); // 显示文件或文件夹信息
    void addComponent(FileSystemComponent component);
    void removeComponent(FileSystemComponent component);
}
