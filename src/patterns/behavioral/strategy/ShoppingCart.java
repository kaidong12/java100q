package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

//上下文类（Context Class）：使用一个具体策略对象来配置，并维护对策略对象的引用
public class ShoppingCart {
	private List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public float calculateTotal() {
		float sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy payStrategy) {
		float amount =  calculateTotal();
		payStrategy.pay(amount);
	}
}
