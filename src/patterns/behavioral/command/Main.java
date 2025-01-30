package patterns.behavioral.command;

/*
 * 命令模式（Command Pattern）是一种行为型设计模式
 * 它将请求封装为一个对象，从而使用户可用不同的请求对客户进行参数化。
 * 命令模式允许将操作的执行与执行者解耦，使得操作可以在不同的时间、地点或上下文中执行。
 * 这种模式特别适合实现可撤销操作、事务处理、日志记录等功能。
 * 
 * */
//客户端（Client）：创建具体命令对象，并将其与接收者关联。
public class Main {
	public static void main(String[] args) {
		// 创建接收者对象
		Light light = new Light();
		Fan fan = new Fan();

		// 创建具体命令对象
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		Command fanOn = new FanOnCommand(fan);
		Command fanOff = new FanOffCommand(fan);

		// 创建调用者对象
		RemoteControl remoteControl = new RemoteControl();

		// 设置命令
		remoteControl.setOnCommand(lightOn);
		remoteControl.setOffCommand(lightOff);

		// 执行命令
		remoteControl.pressOnButton(); // 输出：Light is ON
		remoteControl.pressOffButton(); // 输出：Light is OFF

		// 更改命令
		remoteControl.setOnCommand(fanOn);
		remoteControl.setOffCommand(fanOff);

		// 执行命令
		remoteControl.pressOnButton(); // 输出：Fan is ON
		remoteControl.pressOffButton(); // 输出：Fan is OFF
	}
}
