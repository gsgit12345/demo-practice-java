package org.example.designpattern.StrategyDesignpattern.sortingalgorithmn;

public class ClientProgram {
    public static void main(String str[])
    {
        SortingAlgorithContext context=new SortingAlgorithContext(new BubbleSort());
        context.sortCollection(null);
    }
}
