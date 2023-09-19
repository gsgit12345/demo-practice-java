package org.example.StringQuestion;

import java.security.PublicKey;
import java.util.HashMap;

public class LongestSubArrayWithEqualNumberOfZeroOneTwo {
    public static void main(String str[]) {
        //approach key in hashmap Delta10#Delta21 means delta of 0 - delta of 1 # delta of 0 - delta of 2. would be key in hashmap


        String str4 = "10201012";
        //answer=4
        String str1 = "0102010";
        //ans:-2
        String str2 = "10201012";
        //ans:-4
        String str3 = "102100211";
        //answer:-5
        String st = "1120101212201";
        //6

        int count = countSubstringWithEqual012(str3);
        System.out.println("subarray is::" + count);
        countSubArrayWithEqualNumberOf012PepCoding(st);

        //  int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        //ans:-
        String str01 = "1001011";
        //ans:-8
        countSubarrWithEqualZeroAndOne(str01);
        String strlong = "011011";
        //ans longest subarray=4
        String strlong2 = "1011100";
//ans:-longest sub arraye with equalnum 0,1,2:--6

        String strLong3 = "01";
        //ans --2
        String longsub4="011011";
        //longestsubarray o and 1:--4
       // getLongestSubarrWithEqualZeroAndOne(strLong3);
        getLongestSubarrWithEqualZeroAndOneBruteForce(longsub4);
        String longest012="0102010";
        //length of longestsubarray:--
        getLongestSubarrWithEqualZeroAndOneandtwo(longest012);
    }

    private static int countSubstringWithEqual012(String str) {
        //     Count Substrings with equal number of 0s, 1s and 2s

        // map to store, how many times a difference
        // pair has occurred previously (key = diff1 *
        // diff2)
        //  zc (Count of zeroes), oc(Count of 1s)
        //  and tc(count of twos)
        //  In starting all counts are zero
        // Increasing the count of current character
        // making key of differences (z[i] - o[i],
        // z[i] - t[i])
        // Count of previous occurrences of above pair
        // indicates that the subarrays forming from
        // every previous occurrence to this occurrence
        // is a subarray with equal number of 0's, 1's
        // and 2's
        // increasing the count of current difference
        // pair by 1
        HashMap<String, Integer> hashMap = new HashMap<>();
        int countZero = 0, countOne = 0, countTwo = 0;
        String key = (countZero - countOne) + "#" + (countZero - countTwo);
        hashMap.put(key, 1);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                countZero++;
            } else if (str.charAt(i) == '1') {
                countOne++;
            } else {
                countTwo++;
            }
            key = (countZero - countOne) + "#" + (countZero - countTwo);
            answer = answer + hashMap.getOrDefault(key, 0);
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }
        return answer;
    }

    public static void countSubArrayWithEqualNumberOf012PepCoding(String str) {
        //key delta10#delta21  means countofone-countofzero+"#"+count of 2 -count of 1
        String st = "1120101212201";

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        int answer = 0;
        String key = (countOne - countZero) + "#" + (countTwo - countOne);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(key, 1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                countZero++;
            } else if (str.charAt(i) == '1') {
                countOne++;
            } else {
                countTwo++;
            }
            key = (countOne - countZero) + "#" + (countTwo - countOne);
            if (hashMap.containsKey(key)) {
                answer += hashMap.get(key);
                hashMap.put(key, hashMap.get(key) + 1);
            } else {
                hashMap.put(key, 1);
            }
        }
        System.out.println("count subarray second way::" + answer);
    }



    public static void countSubarrWithEqualZeroAndOne(String str) {

//        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        //ans:-8
        // https://www.youtube.com/watch?v=svMdY6wlQ6I
        //this is applicable for int array,char array or string
        //1-we will assume here 0 is -1 and 1 is +1
        //2-if sum is going to be repeated then we will assume that there is equal number of zero and one in that sub array

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        hashMap.put(sum, 1);
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                sum += -1;
            } else {
                sum += 1;
            }
            if (hashMap.containsKey(sum)) {
                ans += hashMap.get(sum);
                hashMap.put(sum, hashMap.get(sum) + 1);
            } else {
                hashMap.put(sum, 1);
            }
        }
        System.out.println("count subarray of equal num zero and one:" + ans);
    }

    public static void getLongestSubarrWithEqualZeroAndOne(String str) {
        //you hve to tell sub array which have equal number of 0 and 1 and length  of string or array should be longest
        // https://www.youtube.com/watch?v=1WugaISSWx8
        //1-we will assume here 0 is -1 and 1 is +1
        //2-if sum is going to be repeated then we will assume that there is equal number of zero and one in that sub array
        //  Given a binary array A[] consisting of 0’s and 1’s. The task is to return the length of the largest subarray which contains an equal
        //number of 0’s and 1’s.
        //  All you have to do is find the length of the longest subarray with equal number of 0s and 1s
        //  In the given example, subarray {0 1 1 0} is the longest subarray with equal numbers of zeros and ones. And the length of this subarray is '4',
        //  therefore, 4 has been printed as output..
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        hashMap.put(sum, -1);
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                sum += -1;
            } else {
                sum += 1;
            }
            if (hashMap.containsKey(sum)) {
                int index = hashMap.get(sum);
                int length = i - index;
                if (ans < length) {
                    ans = length;
                }
            } else {
                hashMap.put(sum, i);
            }


        }

        System.out.println("hashmap in longest subarrayin 0 and 1" + hashMap.toString() + ":longest subarray:" + ans);

    }
   public static void  getLongestSubarrWithEqualZeroAndOneBruteForce(String str)
   {
     //  All you have to do is find the length of the longest subarray with equal number of 0s and 1s
       //  In the given example, subarray {0 1 1 0} is the longest subarray with equal numbers of zeros and ones. And the length of this subarray is '4',
       //  therefore, 4 has been printed as output..


       int max=0;
       int countZero=0;
       int countOne=0;
       for(int i=0;i<str.length();i++)
       {
           for(int j=i;j<str.length();j++)
           {
               if(str.charAt(j)=='0')
               {
                   countZero++;
               }else
               {
                   countOne++;
               }
               if(countZero==countOne)
               {
                   int  subarraylen=j-i+1;
                   max=subarraylen<max?max:subarraylen;
               }
           }
       }
       System.out.println("max length using brute force approach::"+max);
   }
    public static void getLongestSubarrWithEqualZeroAndOneandtwo(String str) {
        //String longest012=0102010
//logic base on delta10#delta21 means (countof1-countof0)+"#"+(countof2-countof1).would be key
        // suppose if at any place  x1-x0==x1-x0 then there is equal number of zero and one because differences are same.
        //in same way if x2-x1==x2-x1 then there is equal number of 2 and 1 in that area of string or array because differences are same.

        HashMap<String,Integer> hashMap = new HashMap<>();
        int countOne=0;
        int countTwo=0;
        int countZero=0;
        String key=(countOne-countZero)+"#"+(countTwo-countOne);
        hashMap.put(key,-1);
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                countZero++;
            } else if (str.charAt(i)=='1') {

                countOne++;
            }else {
                countTwo++;
            }

            key=(countOne-countZero)+"#"+(countTwo-countOne);
            if(hashMap.containsKey(key))
            {
                int index=hashMap.get(key);
                int lengthsubarray=i-index;
                if(ans<lengthsubarray)
                {
                    ans=lengthsubarray;
                }

            }else
            {
                hashMap.put(key,i);
            }
        }
        System.out.println("longest sub array in 0,1,2 is:: "+ans+":hashmap::"+hashMap);
    }
}