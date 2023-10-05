package runoob;

public class Writer {
	private String name; 
    private int age; 
    public Writer(String myName, int  age) { 
        name = myName; 
        this.age = age; 
    } 
    
    public Writer(int  age) { 
    	this.name = "test"; 
        this.age = age; 
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public int getAge() {
    	return this.age;
    }
    
}
