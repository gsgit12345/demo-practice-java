package org.example.jdk17feature.varkeyword;

import java.util.ArrayList;

public class VarKeywordDemo {
    public static void main(String str[])
    {
        var hello=10;
       // var x; //error initialization is mandatory
      //  var y=(x)->x*x; Cannot infer type: lambda expression requires an explicit target type

      //  var obj = (a, b) -> (a + b); Cannot infer type: lambda expression requires an explicit target type
  //var y=null;//Cannot infer type: variable initializer is 'null'

       // var <var> x=new ArrayList<String>(); can not be used
      //  var<Integer> al = new ArrayList<Integer>();//can not be used


    }
}
