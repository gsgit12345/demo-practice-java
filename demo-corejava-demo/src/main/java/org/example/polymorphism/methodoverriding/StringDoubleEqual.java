package Stringquestion;

public class StringDoubleEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Get some Strings to compare
        String s1 = "A";
        String s2 = "A";
        String s3 = "A";
        String s4 = new String("A");

        // Compare s1 and s2
        // It should return true as they both
        // refer to same object in memory
        System.out.println(s1 + " == " + s2
                         + ": " + (s1 == s2));

        // Compare s1 and s3
        // It should return true as they both
        // refer to same object in memory
        System.out.println(s1 + " == " + s3
                         + ": " + (s1 == s3));
 
        // Compare s2 and s3
        // It should return true as they both
        // refer to same object in memory
        System.out.println(s2 + " == " + s3
                         + ": " + (s2 == s3));
 
        // Compare s1 and s4
        // It should return false as they both
        // refer to different object in memory
        System.out.println(s1 + " == " + s4
                         + ": " + (s1 == s4));
        
        StringEqual();
        
        
	}
public static void StringEqual()
{
    // Get some Strings to compare
    String s1 = "A";
    String s2 = "A";
    String s3 = "a";
    String s4 = new String("A");

    // Compare s1 and s2
    // It should return true as they both
    // have the same content
    System.out.println(s1 + " .equals " + s2
                     + ": " + s1.equals(s2));

    // Compare s1 and s3
    // It should return false as they both
    // have the different content
    System.out.println(s1 + " .equals " + s3
                     + ": " + s1.equals(s3));

    // Compare s2 and s3
    // It should return false as they both
    // have the different content
    System.out.println(s2 + " .equals " + s3
                     + ": " + s2.equals(s3));

    // Compare s1 and s4
    // It should return true as they both
    // have the same content
    System.out.println(s1 + " .equals " + s4
                     + ": " + s1.equals(s4));

}

public static void commpareToMethod()
{
    // Get some Strings to compare
    String s1 = "A";
    String s2 = "A";
    String s3 = "a";
    String s4 = new String("A");

    // Compare s1 and s2
    // It should return 0 as they both
    // have the same ASCII value
    System.out.println(s1 + " .compareTo " + s2
                     + ": " + s1.compareTo(s2));

    // Compare s1 and s3
    // It should return -32 as they both
    // have the different ASCII value
    System.out.println(s1 + " .compareTo " + s3
                     + ": " + s1.compareTo(s3));

    // Compare s3 and s2
    // It should return 32 as they both
    // have the different ASCII value
    System.out.println(s3 + " .compareTo " + s2
                     + ": " + s3.compareTo(s2));

    // Compare s1 and s4
    // It should return 0 as they both
    // have the same ASCII value
    System.out.println(s1 + " .compareTo " + s4
                     + ": " + s1.compareTo(s4));
	
}
}
