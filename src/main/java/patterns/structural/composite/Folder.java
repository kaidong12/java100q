package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

//组合组件（Composite）：表示组合中的对象组合，可以包含子节点（叶子或组合），并提供管理子节点的方法。
public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : children) {
            component.display();
        }
    }
}
