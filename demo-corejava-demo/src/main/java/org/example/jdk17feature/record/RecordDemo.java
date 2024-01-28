package org.example.jdk17feature.record;

public class RecordDemo {
    public static void main(String str[])
    {
        Book book=new Book("harish",30);
        System.out.println(book);

        GenericRecord<String,Integer> genrecord=new GenericRecord<>("hello",10);
        System.out.println("name:"+genrecord.name()+"age"+genrecord.age());

        //nested classes in record
        NestedClassInRecord  nestedClassInRecord=new NestedClassInRecord(new NestedClassInRecord.NestClass("hello",100));

        //interface in the record
        InterfaceInRecord record=new InterfaceInRecord("ram",new InterfaceInRecord.HelloInterface() {
            @Override
            public int getAge() {
                return 10;
            }
        });

System.out.println(record.hello().getAge()+"record property:"+record.name());

AccountRecord accountRecord=new AccountRecord("Ramesh");

System.out.println(accountRecord.getAccount());




    }
}
