package org.example.narendra.array.lambda;

interface changeinstance
{
    public int changeInstance(int a);
}
public class InstanceVariableInLambda {
    int data=10;
    public static void main(String str[])
    {
        InstanceVariableInLambda  data=new InstanceVariableInLambda();
        changeinstance changeinstance=(a)->
        {
            data.data=data.data+a;
            return data.data;
        };

       System.out.println( changeinstance.changeInstance(100));

new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("creating threda using lambda");
    }
}).start();
    }
}
