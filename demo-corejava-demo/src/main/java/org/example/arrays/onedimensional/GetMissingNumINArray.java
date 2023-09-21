package practice.arrayques;

//https://www.geeksforgeeks.org/top-50-array-coding-problems-for-interviews/
public class GetMissingNumINArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1, 2, 4, 6, 3, 7, 8};
		
		int len=array.length;
		int num=getMissingNumInArray(array,len);
		System.out.println(num);

	}

	
	public static int getMissingNumInArray(int array[],int len)
	{
		System.out.println("len is:"+len);
	    int sumofallelement = len * (len + 1) / 2;  //21
	    int sum = 0;
	 
	    for(int i = 0; i < len - 1; i++)
	        sum += array[i]; //31
	         
	    return sumofallelement - sum;

	}
}
