package org.example.jdk17feature.record;

public record NestedClassInRecord(NestClass nestClass) {
    static public class NestClass
    {
        String name;
        int age;
        public NestClass(String name,int  age)
        {
            this.name=name;
            this.age=age;

        }
    }
}
