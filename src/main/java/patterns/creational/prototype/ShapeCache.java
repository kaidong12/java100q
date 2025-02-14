package patterns.creational.prototype;

import java.util.Hashtable;

// 形状缓存类
public class ShapeCache {
	private final static Hashtable<String, Shape> shapeMap = new Hashtable<>();
	
	public static Shape getShape(String shapId) {
		Shape cachedShape = shapeMap.get(shapId);
		return (Shape)cachedShape.clone();
	}
	
	public static void loadCached() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
	}
}
