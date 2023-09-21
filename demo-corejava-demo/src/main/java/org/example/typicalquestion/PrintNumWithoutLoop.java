package executerdemo.typicalquest;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	printNum(100);
	}

	public static void printNum(int num)
	{
		//int n=0;       
		if(num > 0)
        {
			printNum(num - 1);
            System.out.println(num + " ");
        }
		return; 
    }
	
	
}
