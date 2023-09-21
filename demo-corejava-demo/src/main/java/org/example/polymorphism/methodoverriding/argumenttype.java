package methodoveriding;

class employee
{
	int sal;
	public void sal()
	{
		System.out.println("employee");
	}	
} 
class contractemployee extends employee
{
	int sal;
	public void sal()
	{
		System.out.println("contract employee");
	}
}
class permanentemp extends contractemployee
{
	int sal;
	public void sal()
	{
		System.out.println("permanentemp employee");
	}
}
class parentt
{
	public void helloo(employee num)
	{
		System.out.println("parent class");
	}
}
class childd extends parentt
{
	public void helloo(permanentemp num)
	{
		System.out.println("chilw class");
	}
}
public class argumenttype {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parentt pp=new childd();
		pp.helloo(new permanentemp());
	}

}
