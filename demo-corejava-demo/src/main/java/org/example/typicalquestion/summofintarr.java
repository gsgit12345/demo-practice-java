package executerdemo.typicalquest;

public class summofintarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,3,2,2,3,6,4,1,8}; //==38
		summArray(arr);
	}
public static void summArray(int arr[])
{
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	System.out.println(sum);
	int avg=sum/arr.length;
}

}