package org.example.micell;

public class demo1 {

	int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
final demo1 g=new demo1();

demo1 dd=new demo1();
demo1 kk=go(g,dd);

System.out.println((g==kk)+" "+(g.x==kk.x));

	}
static demo1 go(demo1 d,demo1 d2)
{
	final demo1 f=d;
	f.x=7;
	
	return f;
}
}
