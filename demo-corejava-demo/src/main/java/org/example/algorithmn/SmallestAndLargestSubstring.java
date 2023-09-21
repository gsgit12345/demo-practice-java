package algirithm;

public class SmallestAndLargestSubstring {
	public static String getSmallestAndLargest(String s, int k) {
       
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0;i<=s.length()-k;i++){
             String subString = s.substring(i,i+k);
             if(i == 0){
                 smallest = subString;
             }
             if(subString.compareTo(largest)>0){
                 largest = subString;
             }else if(subString.compareTo(smallest)<0)
                 smallest = subString;
      }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
      //  String s = scan.next();
       // int k = scan.nextInt();
        //scan.close();
      
    	String s="welcometojava";
    	int k = 3;
    	
        System.out.println(getSmallestAndLargest(s, k));
    }
}
