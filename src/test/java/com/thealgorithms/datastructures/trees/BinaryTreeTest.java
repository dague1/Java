package com.thealgorithms.datastructures.trees;

import com.thealgorithms.CoverageResults;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @AfterAll
    static void checkCoverage() {
        CoverageResults.printCoverageResults("remove(int value) in datastructures/trees/BinaryTree.java", BinaryTree.getCoverageRemoveFlags());
    }

    @Test
    void testRemoveNode() {
        BinaryTree.Node root = new BinaryTree.Node(5);
        BinaryTree binaryTree = new BinaryTree(root);
        assertTrue(binaryTree.remove(root.data));
    }

    @Test
    void testRemoveNodeValueNotExist() {
        BinaryTree.Node root = new BinaryTree.Node(5);
        BinaryTree binaryTree = new BinaryTree(root);
        assertFalse(binaryTree.remove(3));
    }

    @Test
    void testRemoveLeftChildrenNode() {
        BinaryTree.Node root = new BinaryTree.Node(5);
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.put(4);
        assertTrue(binaryTree.remove(root.left.data));
    }

    @Test
    void testRemoveRightChildrenNode() {
        BinaryTree.Node root = new BinaryTree.Node(5);
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.put(9);
        assertTrue(binaryTree.remove(root.right.data));
    }

}