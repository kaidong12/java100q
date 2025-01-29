package patterns.structural.adapter;

public class PlayerAvi implements MediaPlayerAdvanced{
	@Override
	public void playVlc(String fileName) {
		
	}
	
	@Override
	public void playAvi(String fileName) {
		System.out.println("Playing AVI file, name: " + fileName);
	}

}

