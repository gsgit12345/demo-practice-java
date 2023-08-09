package org.example.designpattern.singleton;

public class LazySingleton {

    private LazySingleton()
    {

    }
    private  static LazySingleton lazySingleton;
    public static LazySingleton getInstance()
    {
        if(lazySingleton==null)
        {
      return      lazySingleton=new LazySingleton();
        }else {
            return lazySingleton;
        }
    }

}
