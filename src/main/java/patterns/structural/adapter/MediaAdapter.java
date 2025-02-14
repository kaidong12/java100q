package patterns.structural.adapter;

//适配器（Adapter）：通过继承或组合的方式，将适配者接口转换为目标接口，使得客户端可以调用适配者的方法。
public class MediaAdapter implements MediaPlayer{
	MediaPlayerAdvanced aviPlayer = new PlayerAvi();
	MediaPlayerAdvanced vlcPlayer = new PlayerVlc();
	
	@Override
	public void play(String videoType, String fileName) {
		if (videoType.equalsIgnoreCase("vlc")) {
			vlcPlayer.playVlc(fileName);
		}else if(videoType.equalsIgnoreCase("avi")) {
			aviPlayer.playAvi(fileName);
		}
	}
}
