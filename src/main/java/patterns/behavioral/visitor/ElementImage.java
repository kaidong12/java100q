package patterns.behavioral.visitor;

//具体元素（Concrete Element）：实现元素接口，提供具体的数据结构
//接受访问
class ElementImage implements Element {
	private String imageUrl;

	public ElementImage(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getImageUrl() {
		return imageUrl;
	}
}