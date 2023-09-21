package practice.exception;
class ExceptionExample {
public static void main(String[] args) {
   test();
}
private static void test() throws NullPointerException{
   throw new NullPointerException();
}
}
/*
Output:  Program will compile properly and it will throw NullPointerException at Runtime.
test() method throws NullPointerException which is Unchecked exception, 
So it is not mandatory for caller to catch it, If it catches still it is fine, that is why compiler 
doesn't complain for catch block.
*/