package executerdemo.nestedclass;


abstract class annonmysdemo
{
	public abstract void hello();
}
public class Annonymousclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			new annonmysdemo() {
			
			@Override
			public void hello() {
				// hello
				
				System.out.println("hello");
				
			}
		}.hello();;
	}

}
