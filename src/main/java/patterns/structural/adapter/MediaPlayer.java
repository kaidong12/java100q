package patterns.structural.adapter;

//目标接口（Target）：定义了客户端需要使用的接口。
public interface MediaPlayer {
	void play(String videoType, String fileName);

}
