package defaultmethod;


class emp
{
	String name;
	public emp(String name)
	{
		this.name=name;
	}
}
public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		emp e=new emp("hello");
		emp e1=new emp("hello");
		e=e1;
		//System.out.println(e==e1);
		//System.out.println(e.equals(e1));
		
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

	}

}
