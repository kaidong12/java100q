package patterns.creational.prototype;

//具体形状类
public class Square extends Shape{
	
	public Square() {
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("In Square: drawing a square now!!");
	}

}
