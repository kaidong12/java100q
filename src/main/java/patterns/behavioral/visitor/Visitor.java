package patterns.behavioral.visitor;

//访问者接口（Visitor）：声明对元素进行操作的方法
//用于访问元素
//相当于导游
interface Visitor {
    void visit(ElementText textElement);
    void visit(ElementImage imageElement);
}
