package patterns.structural.composite;

/*
 * 组合模式（Composite Pattern）是一种结构型设计模式
 * 它允许将对象组合成树形结构，以表示“部分-整体”的层次关系。
 * 组合模式使得客户端可以统一地处理单个对象和对象组合，从而简化客户端代码。
 * 
 * */

//客户端（Client）：通过组件接口与组合中的对象交互，无需区分单个对象和组合对象。
public class Main {
	public static void main(String[] args) {
		// 创建文件和文件夹
		FileSystemComponent file1 = new File("file1.txt");
		FileSystemComponent file2 = new File("file2.txt");
		FileSystemComponent file3 = new File("file3.txt");

		FileSystemComponent folder1 = new Folder("Folder1");
		FileSystemComponent folder2 = new Folder("Folder2");

		// 将文件添加到文件夹
		folder1.addComponent(file1);
		folder1.addComponent(file2);

		folder2.addComponent(file3);
		folder1.addComponent(folder2);

		// 显示文件系统结构
		folder1.display();
	}
}
