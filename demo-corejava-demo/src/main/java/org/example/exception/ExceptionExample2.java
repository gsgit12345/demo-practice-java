package practice.exception;
class ExceptionExample2 {
   
   public static void main(String[] args) {
  System.out.println("Value of a :"+test());
   }
  
   private static int test(){
  int a = 10;
  try {
     return a;
  }finally{
     return a;
  }
   }
}

//ans==10