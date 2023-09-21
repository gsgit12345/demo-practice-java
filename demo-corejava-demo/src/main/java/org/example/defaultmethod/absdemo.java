package defaultmethod;

abstract class anb
{
	public  void hhh() {};
	public synchronized abstract void hhh2();//can not use synchronized
	public final abstract void hhh3();//can not use final
	public strictfp abstract void hhh4();//can not use strictfp
	public static abstract void hhh4e();//can not use static
	public  abstract native void hhh5();//native can not use
}
public class absdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
