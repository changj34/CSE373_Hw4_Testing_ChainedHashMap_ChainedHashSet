package datastructures;

import datastructures.concrete.BST;
import misc.BaseTest;
import org.junit.Test;

public class TestAvlTree extends BaseTest {

    @Test(timeout = SECOND)
    public void testValidAVLTreeBasic() {
        // Creates a Binary Search Tree using the given values provided in insertion order.
        BST tree = new BST(new int[]{2, 1, 3});
        BST tree1 = new BST(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});

        // helper methods to print/see your BST
        tree.printInorder();
        tree.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(true, tree.isValidAVL());
        assertEquals(true, tree1.isValidAVL());
    }

    @Test(timeout = SECOND)
    public void testInvalidAVLTreeBasic() {
        // Creates a Binary Search Tree with the given values provided in insertion order.
        BST tree = new BST(new int[]{1, 2, 3});
        tree.insert(4);  // You can also add nodes to your BST using insert.

        // helper methods to print/see your BST
        tree.printInorder();
        tree.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(false, tree.isValidAVL());
    }

    // Write more black box tests to test cases for an implementation of isValidAVL method.
    //
    // .
    // .
    // .
    
    /*
     * Instructions:
     *
     * We will be running all the tests in this file against 11 different implementations of isValidAVL() method
     * (These implementations are not accessible to you.)
     * One of these implementations is a correct implementation, and the other 10 are buggy implementations.
     *
     * You task is to write black box tests to for an isValidAVL method.
     * Recall from class: a black box test is when you do not know the implementation, but you know the expected
     * behavior.
     *
     *
     *
     * You get points for correctly predicting whether an isValidAVL method implementation is buggy or correct.
     * There are 11 implementations (one correct, 10 buggy), each worth 1 point. If you correctly identify all 11,
     * you get 11 points.
     * But if you fail to identify the correct implementation, you don't get any points at all (you get zero points).
     *
     * When we run all your tests against an implementation,
     *    - if all your tests pass, that means as per your tests the implementation is correct, but
     *    - if even one of your test fails, that means as per your tests the implementation is buggy.
     *
     *
     * For details on how we will test and score your tests, see the course website.
     *
     */
        
    
    @Test(timeout = SECOND)
    public void testEmptyAVLTree() {
        // Creates a Binary Search Tree with the given values provided in insertion order.
        BST tree = new BST(new int[]{});

        // helper methods to print/see your BST
        tree.printInorder();
        tree.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(true, tree.isValidAVL());
    }
    
    @Test(timeout = SECOND)
    public void testSingleAVLTree() {
        // Creates a Binary Search Tree with the given values provided in insertion order.
        BST tree = new BST(new int[]{5});

        // helper methods to print/see your BST
        tree.printInorder();
        tree.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(true, tree.isValidAVL());
    }
    
    @Test(timeout = SECOND)
    public void testUnbalancedAVLTree() {
        // Creates a Binary Search Tree with the given values provided in insertion order.
        BST tree = new BST(new int[]{3, 1, 2, 4, 6, 7, 8});
        BST tree1 = new BST(new int[]{5, 4, 3, 2, 1});

        // helper methods to print/see your BST
        tree.printInorder();
        tree.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(false, tree.isValidAVL());
        assertEquals(false, tree1.isValidAVL());
    }
    
    @Test(timeout = SECOND)
    public void testNegativeAVLTree() {
        // Creates a Binary Search Tree with the given values provided in insertion order.
        BST tree = new BST(new int[]{-3, -1, -2, -4, -6, -7, -8});
        BST tree1 = new BST(new int[]{5, 4, -3, 2, 1});

        // helper methods to print/see your BST
        tree.printInorder();
        tree.printSideways();
        
        tree1.printInorder();
        tree1.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(false, tree.isValidAVL());
        assertEquals(false, tree1.isValidAVL());
    }
    
    @Test(timeout = SECOND)
    public void testSmallAVLTree() {
        // Creates a Binary Search Tree with the given values provided in insertion order.
        BST tree = new BST(new int[]{3});
        BST tree1 = new BST(new int[]{10, 4, 1});

        // helper methods to print/see your BST
        tree.printInorder();
        tree.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(true, tree.isValidAVL());
        assertEquals(false, tree1.isValidAVL());
    }
    
    @Test(timeout = SECOND)
    public void testLargeAVLTree() {
        // Creates a Binary Search Tree with the given values provided in insertion order.
        BST tree = new BST(new int[]{3, 12, 73, 42, 100, 79, 25, 93, 11, 17, 38, 62, 12, 6, 74, 83, 163});
        BST tree1 = new BST(new int[]{});
        for (int i = 0; i < 1000; i++) {
            tree1.insert(i);
        }

        // helper methods to print/see your BST
        tree.printInorder();
        tree1.printSideways();

        // Set the expected value to true if the your BST is a valid AVL tree, otherwise set it to false.
        assertEquals(false, tree.isValidAVL());
        assertEquals(false, tree1.isValidAVL());
    }
    

}
