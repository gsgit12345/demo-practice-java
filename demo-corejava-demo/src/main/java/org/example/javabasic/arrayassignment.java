package org.example.javabasic;

public class arrayassignment {

	public static void main(String[] args) {
	
int r[]= {10,2,4,5};
char []ch= {'a','b','c','d'};
int []f=r;
//int []p=ch;//Type mismatch: cannot convert from char[] to int[]

int a[]= {6,8,9,5,4,7};
int g[]= {70,89};
a=g;
g=a;//valid234

//int [][]k=new int [3][];
//a[0]=new int[4][3];


/////error through command line arg
for(int i=0;i<=args.length;i++)
{
	System.out.println(args[i]);
	
	//now pass a b c
	//it will print=abc and array indexofbound exception
	//now pass a b
	//it will print=ab and array indexofbound exception
	//now pass zero arg
	//it will print array indexofbound exception
}
String ar[]= {"x","y","z"};
ar=args;

for(String s:ar)
{
	System.out.println(s);
	//command line arg--a,b,c but we will get output x,y,z;
}

int [][]l=new int[4][3];//5 object created

l[0]=new int[1];//=1 object
l[1]=new int[2];//=2 object
l=new int[3][2];//=4 object
//12 object created .8 are eligible for garbage collected.



	}

}
