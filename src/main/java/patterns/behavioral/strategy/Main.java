package patterns.behavioral.strategy;

//客户端（Client）：通过上下文类来选择和执行具体策略
public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Item("牙膏", 10));
		cart.addItem(new Item("香皂", 20));
		cart.addItem(new Item("牛奶", 50));
		
//		cart.pay(new StrategyBitcoin("wallet_address"));
//		cart.pay(new StrategyCredit("123456789"));
		cart.pay(new StrategyPaypal("may_email@google.com"));
	}
}
