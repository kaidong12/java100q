package patterns.structural.composite;

//叶子组件（Leaf）：表示组合中的单个对象，是组合的终端节点，不包含子节点。
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
    
    @Override
    public void addComponent(FileSystemComponent component) {
    	throw new UnsupportedOperationException("Cannot add to a file.");
    }

    @Override
    public void removeComponent(FileSystemComponent component) {
    	throw new UnsupportedOperationException("Cannot remove from a file.");
    }
    
}
