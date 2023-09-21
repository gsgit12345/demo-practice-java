package methodoveriding.methodoverloading;

public class ArithmeticOperations{
public void add(int num1,int num2){
System.out.println(num1 + num2);
}
public int add(int num1,int num2, int num3){
int result = num1 + num2 + num3;
return result;
}

public static void main(String args[]){
ArithmeticOperations obj = new ArithmeticOperations();
obj.add(1,2);
int result = obj.add(1,2,3);
System.out.println(result);
}
}
