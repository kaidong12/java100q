package patterns.dependency.injection3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 创建Spring应用上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// 从Spring容器中获取Car对象
		Car car = context.getBean(Car.class);

		// 使用客户端
		car.drive();

		// 关闭Spring应用上下文
		context.close();
	}
}
