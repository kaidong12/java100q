package patterns.behavioral.command;

//接收者（Receiver）：实际执行操作的对象，包含具体的业务逻辑。
public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
