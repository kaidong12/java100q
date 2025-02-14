package patterns.structural.adapter;

//适配者（Adaptee）：定义了需要被适配的接口，它与目标接口不兼容。
public interface MediaPlayerAdvanced {
	void playVlc(String fileName);
	void playAvi(String fileName);
}
