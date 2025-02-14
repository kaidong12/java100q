package patterns.structural.flyweight;

//享元接口（Flyweight）：定义共享对象的接口，描述公共行为
interface Flyweight {
    void display(String position); // 外部状态：棋子的位置
}
