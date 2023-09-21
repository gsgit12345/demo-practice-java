package practice.arrayques;

public class FindCommonElementIn3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        findCommonElementIn3Array(ar1,ar2,ar3);
	}

	
	public static void findCommonElementIn3Array(int arr[],int arr2[],int arr3[])
	{
		int first=arr.length;
		int sec=arr2.length;
		int third=arr3.length;
	int i=0;
	int j=0;
	int k=0;
	
		while(i<first&& j<sec && k<third)
		{
			if(arr[i]==arr2[j] && arr2[j]==arr3[k])
			{
				System.out.println(arr[i]);
				i++;
				j++;
				k++;
			}else if(arr[i]<arr2[j])
			{
				i++;
			}else if(arr2[j]<arr3[k])
			{
				j++;
			}else
			{
				k++;
			}
		}
	}
	
}
