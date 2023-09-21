package practice;

import java.util.HashSet;

public class IntersectionAndUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };
        
        HashSet<Integer> set=unionArray(arr1,arr2);
        
        HashSet set2=intersect(arr1,arr2);
        
        System.out.println("union::"+set);
     //   System.out.println("intersect::"+set2);

	}
	
	public static HashSet<Integer> unionArray(int arr[],int arr2[])
	{
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		return set;
		
	}
	public static HashSet<Integer> intersect(int arr[],int []arr2)
	{
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int a:arr)
		{
			set.add(a);
		}
		for(int a:arr2)
		{
			if(set.contains(a))
		//set.add(a);
			System.out.print("intersect::"+a);
		}
		return set;
	}
	
    static void intersection(int a[], int b[], int n, int m)
    {
        int i = 0, j = 0;
 
        while (i < n && j < m) {
 
            if (a[i] > b[j]) {
                j++;
            }
 
            else if (b[j] > a[i]) {
                i++;
            }
            else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
 


}
