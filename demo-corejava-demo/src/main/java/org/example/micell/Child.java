package misc;

class Child extends Parent{
	  
    /*
     * Private method can not be overridden in Java, they can only be hidden
     */
    private void name(){
        System.out.printf("private method inside Child class in Java %n");
    }
  
    @Override
    public void normal() throws RuntimeException{
        System.out.println("non private overridden method from Child class ");
    }
  
}


