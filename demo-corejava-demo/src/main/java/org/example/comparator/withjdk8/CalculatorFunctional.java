package comparator.withjdk8;

public class CalculatorFunctional {

	interface intgerMath
	{
		public int calculate(int a,int b);
	}
	
	
	public int calculateBI(int a,int b,intgerMath math)
	{
		return math.calculate(a, b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorFunctional fun=new CalculatorFunctional();
		
		intgerMath imath=(a,b)->a+b;
		intgerMath subtract=(a,b)->a-b;
		
		System.out.println(subtract.calculate(9, 9));
	}

}
