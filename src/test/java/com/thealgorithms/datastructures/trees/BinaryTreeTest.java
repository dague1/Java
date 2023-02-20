package com.thealgorithms.datastructures.trees;

import com.thealgorithms.CoverageResults;
import com.thealgorithms.maths.LongDivision;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @AfterAll
    static void checkCoverage() {
        CoverageResults.printCoverageResults("remove(int value) in datastructures/trees/BinaryTree.java", BinaryTree.getCoverageRemoveFlags());
    }

    @Test
    void testOne() {
    }
}