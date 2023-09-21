package practice;

public class FindPairInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[] = { 1, 2, 3, 7, 5, 4 };
        int arr2[] = { 0, 7, 4, 3, 2, 1 };
        int x = 8;


		findPairInTwoArray(arr1,arr2,x);
	}
	
	public static void findPairInTwoArray(int array[],int array2[],int pair)
	{
		int fl=array.length;
		int sl=array2.length;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array[i]+array2[j]==pair)
				{
					System.out.println(array[i]+":"+array2[j]);
				}
			}
		}
	}

}
