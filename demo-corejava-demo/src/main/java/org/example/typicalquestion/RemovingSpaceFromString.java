package executerdemo.typicalquest;

import java.util.StringTokenizer;

public class RemovingSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello  how  are uu";
System.out.println(removeSpace(str));
	}
public static StringBuffer removeSpace(String str)
{
	StringTokenizer token=new StringTokenizer(str," ");
	StringBuffer buff=new StringBuffer();
	
	while(token.hasMoreTokens())
	{
		buff.append(token.nextElement());
	}
	
	return buff;
}
}
