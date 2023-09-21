package org.example;

import static java.util.stream.Collectors.toList;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.example.designpattern.creational.Prototype.prototypewithoutclone.PineTree;
import org.example.designpattern.creational.Prototype.prototypewithoutclone.PlasticTree;
import org.example.designpattern.creational.Prototype.prototypewithoutclone.Tree;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class PrototypeTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {
        double mass = 10.0;
        double height = 3.7;
        PlasticTree plasticTree = new PlasticTree(mass, height);
        PineTree pineTree = new PineTree(mass, height);
        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(toList());
        Tree plasticTreeClone = treeClones.get(0);
        assertEquals(mass, plasticTreeClone.getMass());
        assertEquals(height, plasticTreeClone.getHeight());

    }

}
