package maxfilter;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Thread t=new Thread(
		
		() -> System.out.println("hello")
		);
t.start();
	}

	
	
	 
	
	
}
