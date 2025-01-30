package patterns.behavioral.command;

//接收者（Receiver）：实际执行操作的对象，包含具体的业务逻辑。
public class Fan {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}
