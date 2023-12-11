package org.example.leetcode.matrix;

import java.util.Arrays;

public class transposematrix {
    public static void main(String str[])
    {
       // [[1,2,3],[4,5,6],[7,8,9]]
        //[[1,2,3],[4,5,6]]
        int second[][]={{1,2,3},{4,5,6}};
       int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
      int transpose[][]=  transposeMatrix(matrix);
      System.out.println(Arrays.deepToString(transpose));
    }
    public static int[][] transposeMatrix(int [][] matrix)
    {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[0].length; ++j)
                ans[j][i] = matrix[i][j];
        System.out.println("array output ans::"+Arrays.deepToString(ans));
        return ans;

    }
}
