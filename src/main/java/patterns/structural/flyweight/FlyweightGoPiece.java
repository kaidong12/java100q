package patterns.structural.flyweight;

//具体享元类（ConcreteFlyweight）：实现享元接口，存储内部状态
class FlyweightGoPiece implements Flyweight {
    private final String color; // 棋子颜色（内部状态）

    public FlyweightGoPiece(String color) {
        this.color = color;
    }

    @Override
    public void display(String position) {
        System.out.println("Go Piece: Color = " + color + ", Position = " + position);
    }

}
