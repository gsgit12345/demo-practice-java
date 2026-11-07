package org.example.designpattern.StrategyDesignpattern.sortingalgorithmn;

public class SortingAlgorithContext {
    public ISortCollectionStrategy getiSortCollectionStrategy() {
        return iSortCollectionStrategy;
    }
    public SortingAlgorithContext(ISortCollectionStrategy sortingStrategy) {
        this.iSortCollectionStrategy = sortingStrategy;
    }

    public void setiSortCollectionStrategy(ISortCollectionStrategy iSortCollectionStrategy) {
        this.iSortCollectionStrategy = iSortCollectionStrategy;
    }

    public ISortCollectionStrategy iSortCollectionStrategy;

    public void sortCollection(Object arra[]) {
        iSortCollectionStrategy.sortCollection(arra);
    }

}
