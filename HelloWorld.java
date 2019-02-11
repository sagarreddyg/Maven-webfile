import java.util.Date;

public class HelloWorld {
	
	public HelloWorld(){
		
	}

	public static void main(String[] args) {
		System.out.println("Hello Welcome to ANT !! " + getLocalCurrentDate());
		
	}

	public static Date getLocalCurrentDate() {
		
         return new Date();
	}
	
	

}
