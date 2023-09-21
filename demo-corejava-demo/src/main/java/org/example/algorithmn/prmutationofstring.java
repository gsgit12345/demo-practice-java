package algirithm;

public class prmutationofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prmutationofstring p=new prmutationofstring();
		
		String str="hello";
		int n = str.length();
		permutation(str,0,n-1);
	}

	
	public static  void permutation(String str,int begin,int lenth)
	{
		if (begin == lenth)
		
            System.out.println(str);
            
           // return str;
		
	
	else
	{
		for(int i=begin;i<=lenth;i++)
		{
			str=swap(str,begin,i);
			permutation(str,begin+1,lenth);
			str=swap(str,begin,i);
			
			System.out.println("str is::"+str);
			
		}
		
		//return null;
	}
}
	
	public static String swap(String st, int begin,int j)
	{
		char temp;
		
		char arr[]=st.toCharArray();
		
		temp=arr[begin];
		
		arr[begin]=arr[j];
		arr[j]=temp;
		return String.valueOf(temp); 
		
	}
}
