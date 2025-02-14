package patterns.behavioral.visitor;

//元素接口（Element）： 定义接受访问者的方法（accept）
//接受访问
interface Element {
	void accept(Visitor visitor);
}