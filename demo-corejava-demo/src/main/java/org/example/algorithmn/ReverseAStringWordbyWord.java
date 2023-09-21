package org.example.algorithmn;

public class ReverseAStringWordbyWord {
public static void main(String str[])
{
	String s="hello java to novice";
	
	reverseWords(s.toCharArray());
	reverseChar(s.toCharArray());
}
public static  void reverseWords(char[] s) {
    int i=0;
    for(int j=0; j<s.length; j++){
        if(s[j]==' '){
            reverse(s, i, j-1);        
            i=j+1;
        }
    }
 
    reverse(s, i, s.length-1);
 
    reverse(s, 0, s.length-1);
   for(char c:s)
   {
	 //  System.out.print(c);
   }
    
    
}
 
public static void reverse(char[] s, int i, int j){
    while(i<j){
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
    }
}

public static void reverseChar(char c[])
{
	char temp;
	String d="";
	for(int i=c.length-1;i>=0;i--)
	{
		d+=c[i];
		
	}
	System.out.print(d);
}
}
