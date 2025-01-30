package patterns.behavioral.visitor;

//具体访问者（Concrete Visitor）：实现访问者接口，定义具体的操作
//用于访问元素
//相当于导游
class VisitorPrint implements Visitor {
    @Override
    public void visit(ElementText textElement) {
        System.out.println("Printing text: " + textElement.getContent());
    }

    @Override
    public void visit(ElementImage imageElement) {
        System.out.println("Printing image from: " + imageElement.getImageUrl());
    }
}
