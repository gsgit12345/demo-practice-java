package org.example.javabasic;

public class cmdarg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []argh= {"x","y","z"};
		args=argh;
		
for(String ar:args)
{
	System.out.println(ar);
}

//java cmdarg2 a b c
//output xyz

////second scenario

System.out.println(args[0]+args[1]);
//java cmdarg2 10 20
//output 1020

//scenario third
//java cmdarg2 test note book
//output note
//java cmdarg2 test "note book"
//output note book
System.out.println(args[0]);
	}

}
