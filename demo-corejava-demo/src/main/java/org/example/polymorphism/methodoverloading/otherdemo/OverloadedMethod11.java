package practice.overload;
class OverloadedMethod11{             
public void test(char i, Character j) {
      System.out.println("method 1");
}
public void test(Character i, Character j) {
      System.out.println("method 2");
} 
public static void main(String[] args) {
      OverloadedMethod obj = new OverloadedMethod();
      obj.test('a','a');
}
}
/*
Output:  Compile Error
Why it gave Compile Error? 
 Java overloaded method call is resolved using 3 steps,
 STEP 1: Compiler will try to resolve call without boxing and unboxing and variable 
                 argument.
 STEP 2: Compiler will try to resolve call by using boxing and unboxing.
 STEP 3: Compiler will try to resolve call by using boxing/unboxing and variable argument.
 If call is not resolved by using any of the 3 ways then it gives compile error.
 In our case, method call, test('a','a') is not resolved by using STEP 1 because,
 In STEP 1, 1st argument of method test(char i, Character j) is mapped but for 2nd parameter
 it is not able to resolved using STEP 1, so control flow to STEP 2 for method resolution.
 In STEP 2, Compiler tries to resolve call using Boxing and Un-Boxing and found that both 
 method is applicable and valid for call to test('a','a') and that is why Compiler stop here and 
 gave Ambiguous method call error.
 
 */
