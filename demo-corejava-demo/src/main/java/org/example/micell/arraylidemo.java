package org.example.micell;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class arraylidemo {
public static void main(String str[]) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException
{
	ArrayList al=new ArrayList();
al.add("dd");
	System.out.println("size is:::"+al.size()+"capacity:;");
	 Field dataField = ArrayList.class.getDeclaredField( "elementData" );
     dataField.setAccessible( true );
     System.out.format( "Size: %2d, Capacity: %2d%n",al.size(), ( (Object[]) dataField.get( al ) ).length );
}
}

