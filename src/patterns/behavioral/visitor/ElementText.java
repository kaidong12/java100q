package patterns.behavioral.visitor;

//具体元素（Concrete Element）：实现元素接口，提供具体的数据结构
//接受访问
class ElementText implements Element {
	private String content;

	public ElementText(String content) {
		this.content = content;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getContent() {
		return content;
	}
}
