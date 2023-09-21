package practice.exception;

class ExceptionExample1 {
  
  public static void main(String[] args) {
    System.out.println("Value of a :"+test());
  }
    
  private static int test(){
    int a = 10;
    try {
      return a;
    } catch (Exception e) {
      a = 20;
      System.out.println("a in catch : "+a);
      return a;
    }finally{
      a = 30;
      System.out.println("a in finally : "+a);
      return a;
    }
  }
}

//ans --30,30