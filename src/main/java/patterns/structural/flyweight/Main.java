package patterns.structural.flyweight;

/*
 * 享元模式（Flyweight Pattern）是一种结构型设计模式;
 * 通过共享对象来减少内存使用，从而提升性能;
 * 它特别适用于需要创建大量相似对象的场景。
 * 
 * */
//客户端（Client）：通过享元工厂获取享元对象，并传递外部状态
public class Main {
	public static void main(String[] args) {
		// 下棋操作
		class PlayChess {
			public void play(String color, String position) {
				Flyweight piece = GoPieceFactory.getFlyweight(color);
				piece.display(position);
			}
		}

		PlayChess playChess = new PlayChess();
		playChess.play("White", "D4");
		playChess.play("Black", "D5");
		playChess.play("White", "C6");
		playChess.play("Black", "D9");

	}
}
