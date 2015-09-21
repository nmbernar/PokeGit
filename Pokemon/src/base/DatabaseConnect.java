package base;

public class DatabaseConnect {

	private static final String USER = "";
    private static final String PASS = "";
    
    private static String DB_URL = "";
    
    public DatabaseConnect(){	
    }
    
    public String getUsername(){
    	return USER;
    }
    
    public String getPass(){
    	return PASS;
    }
    
    public String getURL(){
    	return DB_URL;
    }
    
}
