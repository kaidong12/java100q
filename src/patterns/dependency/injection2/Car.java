package patterns.dependency.injection2;

public class Car {
    private Engine engine;

    // Setter注入
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
}
