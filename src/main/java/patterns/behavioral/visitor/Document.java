package patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

//对象结构（Object Structure）：维护一组元素，并允许访问者访问这些元素
class Document {
	private List<Element> elements = new ArrayList<>();

	public void addElement(Element element) {
		elements.add(element);
	}

	public void acceptVisitor(Visitor visitor) {
		for (Element element : elements) {
			element.accept(visitor);
		}
	}
}