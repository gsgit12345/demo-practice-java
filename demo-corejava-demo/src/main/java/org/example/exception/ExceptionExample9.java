package practice.exception;

import java.io.IOException;

interface InterfaceTest{ 
       public void test() throws Exception; 
}
       
class ExceptionExample9 implements InterfaceTest{
       public void test() throws Exception, IOException, RuntimeException, Error {
       }
              
       public static void main(String[] args) {
       }
}
/*
In InterfaceTest, one method is declared name test() which throws Exception. 
So for the class which implements InterfaceTest need to define method test() which either 
throws Exception class or any number of subclass of Exception and is perfectly valid 
inherited test() method.
*/
