package constructordemo;

class parentcls {
	parentcls() 
	{
		System.out.println("parentcls-Constructor Called");
		
	}
 
    {
        System.out.println("parentcls-IIB block");
    }
}
 
// Child class
class childcls extends parentcls {
	childcls()
    {
        super();
        System.out.println("childcls-Constructor Called");
    }
    {
        System.out.println("childcls-IIB block");
    }

}
public class instanceinitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childcls pr=new childcls();
	}

}
