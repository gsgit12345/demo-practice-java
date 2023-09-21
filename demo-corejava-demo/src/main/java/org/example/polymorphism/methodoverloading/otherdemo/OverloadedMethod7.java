package practice.overload;
class OverloadedMethod{      
     public void test(char obj) {
          System.out.println("Char");
     }
     public void test(int obj) {
          System.out.println("Int");
     } 
     public static void main(String[] args) {
          OverloadedMethod obj = new OverloadedMethod();
          obj.test('a');
     }
}

/*
From a byte   ---> short ---> int ---> long ---> float ---> double
From a short  ---> int ---> long ---> float ---> double
From a char   ---> int ---> long ---> float ---> double
From an int    ---> long ---> float ---> double
From a long   ---> float ---> double
From a float   ---> double
Java's Narrow conversions rules are,
From a byte     ---> char
From a short    ---> byte ---> char
From a char     ---> byte ---> short
From an int      ---> byte ---> short ---> char
From a long     ---> byte ---> short ---> char ---> int
From a float     ---> byte ---> short ---> char ---> int ---> long
From a double  ---> byte ---> short ---> char ---> int ---> long ---> float
*/