package patterns.creational.prototype;

// 2025-01-29
// 客户端
public class Main {
	public static void main(String[] args) {
		ShapeCache.loadCached();
		Shape cloneShape1 = ShapeCache.getShape("1");
		System.out.println("Shape : " + cloneShape1.getType());
		
		Shape cloneShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + cloneShape2.getType());

	}
}
