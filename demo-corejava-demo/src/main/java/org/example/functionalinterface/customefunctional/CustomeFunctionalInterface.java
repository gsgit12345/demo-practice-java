package functionalinterface.customefunctional;

interface Square {
    int calculate(int x);
}


public class CustomeFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		Square s=(int b)->b*b;
		
		int ans=s.calculate(a);
		
		System.out.println(ans);

	}

}
