package org.example.jdk17feature.sealedclasses;

public class CntextualKeyword {
    public int record()
    {
        int record=10;
        System.out.println("record keyword as identifier");
        return 10;
    }

    public static void main(String str[])
    {
        CntextualKeyword record=new CntextualKeyword();
        record.record();
    }
}
