package patterns.behavioral.command;

//具体命令类（Concrete Command）：实现命令接口，封装了接收者对象，并调用接收者的方法来执行操作。

public class FanOffCommand implements Command {
	private Fan fan;

	// ConcreteCommand（具体命令）：实现命令接口，绑定接收者和动作
	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.turnOff();
	}
}
