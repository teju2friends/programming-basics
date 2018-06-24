package com.pulsethought.learn.algirithems.test;

import com.pulsethought.learn.algirithems.BinaryTree;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void test() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.addValue(50);
        tree.addValue(30);
        tree.addValue(60);
        tree.addValue(52);
        tree.addValue(62);
        tree.addValue(51);
        tree.addValue(54);

        System.err.println(tree);

    }

}
