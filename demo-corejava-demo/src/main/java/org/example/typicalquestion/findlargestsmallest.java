package executerdemo.typicalquest;

public class findlargestsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,12,56,3,12,2,3,67,34,21,98,100};
		largestSmallestNum(arr);

	}
public static void largestSmallestNum(int arr[])
{
	int big=arr[0];
	int small=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>big)
		{
			big=arr[i];
		}
		else if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	
	System.out.println("small:"+small+":big:"+big);
}
}
