package org.example.Collection.SIBandIIB;

public class IIBandSIBInitializerBlockDEmo {
    int a=10;
    static int y=20;
    {
       System.out.println("a is::"+a+":y is::"+y);
    }
    {
        System.out.println("secon block  is::"+a+": second block y is::"+y);
    }
    {
        System.out.println("third block  is::"+a+": third block y is::"+y);
    }
    static
    {
        System.out.println(": static block  first y is::"+y);
    }
    static
    {
        System.out.println(": static block  third y is::"+y);
    }
    public static void main(String str[])
    {
        IIBandSIBInitializerBlockDEmo  demo=new IIBandSIBInitializerBlockDEmo();
    }
}
