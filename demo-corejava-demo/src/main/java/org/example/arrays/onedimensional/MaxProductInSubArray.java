package org.example.arrays.onedimensional;

public class MaxProductInSubArray {
    public static void main(String str[]) {
       // Input:  { -6, 4, -5, 8, -10, 0, 8 }
        //Output: 1600
        //Explanation: The maximum product subarray is {4, -5, 8, -10} having product 1600
       // Input:  { 40, 0, -20, -10 }
        //Output: 200
        //Explanation: The maximum product subarray is {-20, -10} having product 200

int third[]={ 40, 0, -20, -10 }; //200
        //subarray[-20,-10]
        int[] array = {6, -4, -10, 1, 2};
        int[] nums = {2, 9, -4, 4, -1, 7, 2, -5, 8};//4032
       // int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
//subarray[7,-8,-2]
        int arr[] ={6, -3, -10, 0, 2};//180
        //subarray[6,-3,-10]
        int arr2[] = {-1, -3, -10, 0, 60};//60
        //subarray[60]
        int[] arrays = { -6, 4, -5, 8, -10, 0, 8 }; //1600
        int[] num = {2, 3, -2, 4, -1, 0, 2, -5, 8}; //48
        //subarray[2,3,8]
        int num1[] = {2, 3, -2, 4};//6
        //subarray[2,3]
        int  num2[] = {-2, 0, -1};
        //subarra[0]


//int a=-2+4+-1+0+2+-5;
//System.out.println("a is ::"+a);
       // int maxproduct = maxProductInSubarrayNaiveApproach(arr);
        //System.out.println("maxproduct::" + maxproduct);
        int max=maxProductOfSubArray(arr);
        System.out.println("second way max::" + max);
    }

    public static int maxProductInSubarrayNaiveApproach(int array[]) {
        //time big(n2)
        //space big(1)
        int maxproduct = array[0];
        for (int i = 0; i < array.length; i++) {
            int currentMax = 1;
            for (int j = i; j < array.length; j++) {
                currentMax = currentMax * array[j];
                if (maxproduct < currentMax) {
                    maxproduct = currentMax;
                }
            }

        }
        return maxproduct;
    }
    public static int maxProductOfSubArray(int array[])
    {
        //time big(n)
        //space big

        //step to be followed
        //1-check the length of the array if it is 0 then return 0
        //2-take three variable maxProduct,currentMin and currentMax and assign with array[0] to these variable.
        //3-run the loop from i=1 till array.length.within loop check that array[i]<0 if yes then swap the currenMax and currentMIn.
        //4-calculate the currentMax like currentMax=currentMax*array[i] and in the same way calculate the currentMin=currentMin*array[i]
        //5-check if array[i]>currentMax if yes then assign currentMax=array[i] and in same way check array[i]<currentMin then assign currentMin=array[i]
        //6-check the if currentMax>maxProduct then maxProduct=currentMax
        //7-end the loop and return the maxProduct from function
        if(array.length==0)
            return 0;
        int maxProduct=array[0];
        int currentMin=array[0];
        int currentMax=array[0];
        for(int i=1;i<array.length;i++)
        {
          if(array[i]<0)
            {
                int temp=currentMax;
                currentMax=currentMin;
                currentMin=temp;
            }
            currentMax=currentMax*array[i];
            currentMax=array[i]<currentMax?currentMax:array[i];

            currentMin=   currentMin * array[i];
            currentMin=array[i]<currentMin?array[i]:currentMin;

            maxProduct=maxProduct<currentMax?currentMax:maxProduct;
        }
        return  maxProduct;
        }

}
