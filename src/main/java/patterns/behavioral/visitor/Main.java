package patterns.behavioral.visitor;

/*
 * 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作。
 * 
 * 分离算法与对象结构： 当对象结构中的对象需要执行多种不同的操作时，访问者模式可以将这些操作封装在独立的访问者类中，实现算法与对象结构的分离。
 * 扩展性： 如果对象结构经常变化，或者需要根据不同的条件执行不同的操作，访问者模式可以在不修改对象结构的情况下，灵活地添加新的操作。
 * 符合开闭原则： 遵循软件设计的开闭原则，对扩展开放，对修改封闭。可以通过添加新的访问者类来扩展功能，而无需修改现有代码。
 * 
 * */
//客户端代码
public class Main {
	public static void main(String[] args) {
		Document document = new Document();
		document.addElement(new ElementText("Hello, World!"));
		document.addElement(new ElementImage("http://example.com/image.jpg"));
		document.addElement(new ElementText("Java Design Patterns"));
        document.addElement(new ElementImage("http://example.com/image2.jpg"));

		// 打印操作
        Visitor printVisitor = new VisitorPrint();
        document.acceptVisitor(printVisitor);

        // 统计操作
        Visitor countVisitor = new VisitorCount();
        document.acceptVisitor(countVisitor);

        // 获取统计结果
        VisitorCount countVisitorInstance = (VisitorCount) countVisitor;
        System.out.println("Total text characters: " + countVisitorInstance.getTextCount());
        System.out.println("Total images: " + countVisitorInstance.getImageCount());
	}
}
