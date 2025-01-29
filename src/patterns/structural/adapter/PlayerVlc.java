package patterns.structural.adapter;

public class PlayerVlc implements MediaPlayerAdvanced{
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC file, name: " + fileName);
	}
	
	@Override
	public void playAvi(String fileName) {
		
	}

}
