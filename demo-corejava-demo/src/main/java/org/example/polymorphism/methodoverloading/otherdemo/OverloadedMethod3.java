package practice.overload;
class OverloadedMethod{
   public void test(String obj1, Object obj2) {
      System.out.println("B");
   }
      
   public void test(Object obj1, String obj2) {
      System.out.println("C");
   }
      
   public static void main(String[] args) {
      OverloadedMethod obj = new OverloadedMethod();
      obj.test(null, null);
   }
}