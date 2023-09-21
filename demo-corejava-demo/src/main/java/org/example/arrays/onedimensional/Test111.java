package practice;

public class Test111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] arr={"You", "are", "beautiful", "looking"};
		
		String array[]=sortByLength(arr);
		for(String atr:array)
		{
			System.out.println(atr);
		}
		
	}

	public  static String[] sortByLength(String arr[])
	{
		int n=arr.length;
		
		for(int i=1;i<n;i++)
		{
			String first=arr[i];
			
			int k=i-1;
			while(k>=0 && first.length()<arr[k].length())
			{
				arr[k+1]=arr[k];
					k--;
				
			}
			arr[k+1]=first;
		}
		
		return arr;
	}
}
