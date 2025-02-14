package patterns.creational.prototype;

//具体形状类
public class Circle extends Shape{
	
	public Circle() {
		type="Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("In Circle, drawing a circle now!");
	}

}
