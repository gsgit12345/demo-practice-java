package org.example.designpattern.StrategyDesignpattern.sortingalgorithmn;

public class BubbleSort implements ISortCollectionStrategy {
    @Override
    public void sortCollection(Object[] array) {
        System.out.println("bubble sort algorith");
    }
}
