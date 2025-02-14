package patterns.behavioral.visitor;

//定义新的访问者类（CountVisitor）
//用于访问元素
//相当于导游
public class VisitorCount implements Visitor {

	private int textCount = 0; // 文本字符数
	private int imageCount = 0; // 图片数量

	@Override
	public void visit(ElementText textElement) {
		textCount += textElement.getContent().length(); // 统计文本字符数
	}

	@Override
	public void visit(ElementImage imageElement) {
		imageCount++; // 统计图片数量
	}

	public int getTextCount() {
		return textCount;
	}

	public int getImageCount() {
		return imageCount;
	}
}
