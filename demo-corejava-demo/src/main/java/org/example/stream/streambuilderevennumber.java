package streamtut;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streambuilderevennumber {

	public static void main(String[] args) {
		
		List<Integer> listint=new ArrayList();
		
		for(int i=0;i<30;i++)
		{
			listint.add(i);
	
		}
		
	List<Integer> evenNum=	listint.stream().filter((k)->k%2==0).collect(Collectors.toList());
			
	evenNum.forEach((k)->System.out.println(k));
		

	}

}
