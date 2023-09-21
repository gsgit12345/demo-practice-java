package practice;

public class removewhitespacefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java programming language demo";
		
		char ch[]=str.toCharArray();
		String str2="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				str2=str2+ch[i];
			}
		}

		System.out.println("="+str2);
		
		//method 2
		
		String str3="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			str3=str3+str.charAt(i);
			}
		}
		
		System.out.println("second:"+str3);
		
		//third way
		
	String str4=str.replaceAll(" ", "");
	System.out.println("fourth:"+str4);
	
	}

}
