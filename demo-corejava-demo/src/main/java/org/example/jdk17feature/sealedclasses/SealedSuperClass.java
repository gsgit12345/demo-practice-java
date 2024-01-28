package org.example.jdk17feature.sealedclasses;

public sealed class SealedSuperClass permits sealedone,sealedtwo {
public  String sealSuperFun()
{
    return "super sealed class";
}
    public  String sealNonStatic()
    {
        return "super sealed non-static fun";
    }
}
final class sealedone extends  SealedSuperClass{
    public  String sealSuperFun()
    {
        return "chiled sealedone class";
    }
    public  String sealNonStatic()
    {
        return "chiled sealed non-static fun";
    }
}

non-sealed  class sealedtwo extends  SealedSuperClass
{
public String sealedtwoFun()
{
    return "chiled sealedtwo class";
}
}