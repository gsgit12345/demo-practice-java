package practice;

public class FindClosestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int findClosetNum(int array[],int target)
	{
		
		int len=array.length;
		if(target==array[0])
			return  array[0];
		if(target==array[len-1])
			return array[len-1];
		
		int i=0;
		int mid=0;
		int j=0;
		while(i<len)
		{
			mid=i+len/2;
			if(target<array[mid])
			{
			if(mid>0 && target>array[mid-1])
				getnum(array[mid-1],array[mid],target);
			
			j=mid;
			}
			else
			{
			
			if(mid<len-1 && target<array[mid+1])
				return  getnum(array[mid],array[mid+1],target);
				
				i=mid+1;
				
			}
		}
		
		return array[mid];
	}


	public static int getnum(int first, int second, int target) {
		
		if(target-first>target-second)
			return first;
		else
			return second;
			
		
		
		
	}
	
}
