package StringInterviewQ;

//5.Write a java program to count the occurrences of a given character without using any loop

public class countnumofoccofcharwitotloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="hhhjjkkknnn";
	System.out.println(countoccurenceinstringwithoutloop(str,'j'));
		
	}

	
	public static int countoccurenceinstringwithoutloop(String str,char c)
	{
		
	String userStr=str;
	String findChar=String.valueOf(c);
	
	int inlength=userStr.length();
	System.out.println("input lent:"+inlength);
	
	String newstr=userStr.replace(findChar, "");
	
		int lent=newstr.length();
		System.out.println("after replace lent:"+lent);
		int totalocc=inlength-lent;
		
		return totalocc;
	}
}
