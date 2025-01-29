package patterns.structural.adapter;

public class Main {

	public static void main(String[] args) {

		VideoPlayer player = new VideoPlayer();
		
		String file1 = "gogogo.avi";
		player.play(file1.split("\\.")[1], file1);
		
		String file2 = "gogogo.vlc";
		player.play(file2.split("\\.")[1], file2);
		
		String file3 = "gogogo.kvm";
		player.play(file3.split("\\.")[1], file3);

	}

}
