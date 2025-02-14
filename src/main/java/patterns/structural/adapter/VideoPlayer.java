package patterns.structural.adapter;

public class VideoPlayer implements MediaPlayer {
	MediaAdapter adapter = new MediaAdapter();
	
	@Override
	public void play(String videoType, String fileName) {
		if (videoType.equalsIgnoreCase("map4")) {
			System.out.println("Playing MP4 file, name: " + fileName);
		}else if (videoType.equalsIgnoreCase("vlc") || videoType.equalsIgnoreCase("avi")) {
			adapter.play(videoType, fileName);
		}else {
			System.out.println("Invalid media. " + videoType + " format not supported!");
		}
	}
}
