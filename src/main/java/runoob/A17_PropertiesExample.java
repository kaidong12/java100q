package runoob;

import java.util.Properties;

public class A17_PropertiesExample {

    public static void main(String[] args) {
        
    	/*
    	 * 	void load(InputStream inStream): Reads a property list from the specified input stream.

			void store(OutputStream out, String comments): Writes this property list to the output stream in a format suitable for loading into a Properties table using the load(InputStream) method.
			
			String getProperty(String key): Searches for the property with the specified key in this property list.
			
			void setProperty(String key, String value): Sets the property with the specified key in this property list.
			
			Enumeration<?> propertyNames(): Returns an enumeration of all the keys in this property list.
			
			void list(PrintStream out): Prints this property list out to the specified output stream.
			
			void list(PrintWriter out): Prints this property list out to the specified output stream.
			
			void loadFromXML(InputStream in): Loads all of the properties represented by the XML document on the specified input stream into this properties table.
			
			void storeToXML(OutputStream os, String comment): Emits an XML document representing all of the properties contained in this table.
			
			void storeToXML(OutputStream os, String comment, String encoding): Emits an XML document representing all of the properties contained in this table, using the specified encoding.
    	 * */
    	
        // Create a new Properties object
        Properties props = new Properties();
        
        // Add some key-value pairs to the properties object
        props.setProperty("name", "John Doe");
        props.setProperty("email", "johndoe@example.com");
        props.setProperty("age", "30");
        
        // Retrieve a value from the properties object
        String name = props.getProperty("name");
        System.out.println("Name: " + name);
        
        // Retrieve a value from the properties object, with a default value if the key does not exist
        String phone = props.getProperty("phone", "N/A");
        System.out.println("Phone: " + phone);
        
        // Check if a key exists in the properties object
        boolean hasEmail = props.containsKey("email");
        System.out.println("Has email: " + hasEmail);
        
        // Get all the keys in the properties object
        System.out.println("Keys:");
        for (String key : props.stringPropertyNames()) {
            System.out.println(key);
            System.out.println("getProperty: " + props.getProperty(key));
        }
        
        // Remove a key from the properties object
        props.remove("age");
        System.out.println("Age removed");
        
        // Check the size of the properties object
        int size = props.size();
        System.out.println("Size: " + size);
        
        // Clear all the key-value pairs from the properties object
        props.clear();
        System.out.println("Cleared all properties");
    }
}
