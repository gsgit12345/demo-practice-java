package methodoveriding;


class parent3
{
	public Number hello()
	{
		return new Integer(10);
	}
}
class child3 extends parent3
{
	public Integer hello()
	{
		return new  Integer(10);
	}
}
public class returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
