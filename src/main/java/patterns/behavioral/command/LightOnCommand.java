package patterns.behavioral.command;

//具体命令类（Concrete Command）：实现命令接口，封装了接收者对象，并调用接收者的方法来执行操作。
public class LightOnCommand implements Command {
	private Light light;

	// ConcreteCommand（具体命令）：实现命令接口，绑定接收者和动作
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
