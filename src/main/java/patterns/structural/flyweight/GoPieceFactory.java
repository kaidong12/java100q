package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//享元工厂（FlyweightFactory）：管理享元对象的创建和共享
class GoPieceFactory {
    private static final Map<String, Flyweight> flyweightMap = new HashMap<>();

    public static Flyweight getFlyweight(String color) {
        if (!flyweightMap.containsKey(color)) {
            flyweightMap.put(color, new FlyweightGoPiece(color));
            System.out.println("创建新围棋棋子，颜色为: " + color);
        }
        return flyweightMap.get(color);
    }
}
