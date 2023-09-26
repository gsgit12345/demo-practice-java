package org.example.stringandarrayquestion;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSumTripletProblem {
    public static void main(String str[])
    {
        int  array[] ={7, 12, 3, 1, 2, -6, 5, -8, 6};
        int target=0;
        int indice[]=usingSortingTechnique(array,target);
        System.out.println("using sorting technique::"+Arrays.toString(indice));

        int indice1[]=tripletUsingCollection(array,target);
        System.out.println("using collection technique::"+Arrays.toString(indice1));

    }

    public static int[] tripletUsingCollection(int array[],int target)
    {
        HashMap<Integer,Integer> hashMap=new HashMap();
        for(int i=0;i<array.length;i++)
        {
            int remaining=target-array[i];
            for(int j=i+1;j<array.length;j++)
            {
                int currentTarget=remaining-array[j];
                if(hashMap.containsKey(currentTarget))
                {
                    return  new int[]{array[i],array[j],array[currentTarget]};
                }else
                {
                    hashMap.put(currentTarget,array[j]);
                }
            }
        }
        return new int[]{};
    }
    public static int[] usingSortingTechnique(int array[],int target)
    {
        // Time complexity: O(n^2)
        //time complexity:-big(1)

        Arrays.sort(array);
        int [] indices=null;
        for(int i=0;i<array.length;i++) {
            int left = i + 1;

            int right = array.length - 1;
            while (left < right) {
                if (array[i] + array[left] + array[right] == target) {

                    indices = new int[]{array[i], array[left], array[right]};
                    left++;
                    right--;

                } else if (array[i] + array[left] + array[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return indices;
    }


}
