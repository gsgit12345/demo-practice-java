package org.example.designpattern.BreakingSingleton;

public class SingletonParent implements Cloneable{
    int i = 10;

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
   // @Override    this will resolve the issue breaking singleton using clone.
    //protected Object clone()
      //      throws CloneNotSupportedException
    //{
      //  return super.clone();
    //}

}

// Singleton class
class Singleton extends SingletonParent {
    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();

    private Singleton()
    {
        // private constructor
    }

    public static Singleton getInstance()
    {
        return instance;
    }
}


