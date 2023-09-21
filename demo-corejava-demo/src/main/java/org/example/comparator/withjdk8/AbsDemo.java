package comparator.withjdk8;


class absdemocls
{
	int a;
	String ss;
	absdemocls()
	{
		
	}
	absdemocls(int a, String b)
	{
		this.a=a;
		this.ss=b;
	}
	
	public void show()
	{
		System.out.println("a is::"+a+":ss is:"+ss);
	}
}

class reldemo extends absdemocls
{
	reldemo()
	{
		super(11,"hello");
	}
	
	public void dis()
	{
		super.show();
	}
}
public class AbsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reldemo dd=new reldemo();
		dd.dis();
	}

}
