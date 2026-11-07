package org.example.designpattern.creational.proxyinternetaxxes;

public class ClientDemo {
    public static void main(String str[])
    {
        ProxyInternetAccess internetAccess=new ProxyInternetAccess("suresh");
        internetAccess.grantInternetAccess();
        //https://javadevjournal.com/java-design-patterns/proxy-design-pattern/
    }
}
