package miscell;

import java.util.TreeSet;

class The_Comparator implements Comparable<String> {
    public int compareTo(String str1)
    {
        String first_Str;
        String second_Str="";
        first_Str = str1;
       // second_Str = str2;
        return second_Str.compareTo(first_Str);
    }
}
  
public class Tree_Set_Demo {
    public static void main(String[] args)
    {
        TreeSet<String> tree_set = new TreeSet<String>(new
        The_Comparator());
  
        tree_set.add("G");
        tree_set.add("E");
        tree_set.add("E");
        tree_set.add("K");
        tree_set.add("S");
        tree_set.add("4");
        System.out.println("Set before using the comparator: "+
        tree_set);
  
        System.out.println("The elements sorted in descending"+
        "order:");
        for (String element : tree_set)
            System.out.print(element + " ");
    }
}
