package practice.exception;
class ExceptionExample {
    public static void main(String[] args) {
   test();
    }
    private static void test()
    {
   throw new Exception();
    	
    }
}
/*
Exception class is checked exception and when some method throw CHECKED exception,
then it requires a handler for checked exception or the method itself throws the exception 
claiming as I am not going to handle exception and whoever calls me need to be handled. 
So test() method here doesn't provided a handler for it nor it throws Exception as  
indication to compiler that it is not going to handle it that is why it is compile time error.
*/