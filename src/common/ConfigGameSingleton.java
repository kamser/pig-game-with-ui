package common;

public class ConfigGameSingleton {
	
	 private static ConfigGameSingleton instance;

	    private ConfigGameSingleton(){}

	    // static block initialization for exception handling
	    static {
	        try {
	            instance = new ConfigGameSingleton();
	        } catch (Exception e) {
	            throw new RuntimeException("Exception occurred in creating singleton instance");
	        }
	    }

	    public static ConfigGameSingleton getInstance() {
	        return instance;
	    }

}
