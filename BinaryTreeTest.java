import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void testBinaryTree() {
	fail("Not yet implemented");
    }

    @Test
    public void testBinaryTreeString() {
	fail("Not yet implemented");
    }

    @Test
    public void testBinaryTreeStringBinaryTreeBinaryTree() {
	fail("Not yet implemented");
    }

    @Test
    public void testGetData() {
	fail("Not yet implemented");
    }

    @Test
    public void testGetLeft() {
	fail("Not yet implemented");
    }

    @Test
    public void testGetRight() {
	fail("Not yet implemented");
    }

    @Test
    public void testSetData() {
	fail("Not yet implemented");
    }

    @Test
    public void testSetLeft() {
	fail("Not yet implemented");
    }

    @Test
    public void testSetRight() {
	fail("Not yet implemented");
    }

    @Test
    public void testIsEmpty() {
	fail("Not yet implemented");
    }

    @Test
    public void testIsLeaf() {
	fail("Not yet implemented");
    }

    @Test
    public void testNodeCount() {
	fail("Not yet implemented");
    }

    @Test
    public void testPrune() {
	fail("Not yet implemented");
    }

    @Test
    public void testIsFull() {
	fail("Not yet implemented");
    }

    @Test
    public void testIsComplete() {
	fail("Not yet implemented");
    }

    @Test
    public void testLeafCount() {
	BinaryTree testLeft = new BinaryTree("B", new BinaryTree("D"), new BinaryTree("E"));
	BinaryTree test = new BinaryTree("A", testLeft, new BinaryTree("C"));
	assertEquals("Leftcount is: ", 3, test.leafCount());
    }

    @Test
    public void testMirrorImage() {
	BinaryTree testLeft = new BinaryTree("B", new BinaryTree("D"), new BinaryTree("E"));
	BinaryTree test = new BinaryTree("A", testLeft, new BinaryTree("C"));
	BinaryTree testMirror = test.mirrorImage();
	assertEquals("MirrorImage is: ", test.right.data, testMirror.left.data);
    }

    @Test
    public void testHeight() {
	fail("Not yet implemented");
    }

    @Test
    public void testLevelCount() {
	BinaryTree testLeft = new BinaryTree("B", new BinaryTree("D"), new BinaryTree("E"));
	BinaryTree test = new BinaryTree("A", testLeft, new BinaryTree("C"));
	assertEquals("LevelCount 1 is: ", 2, test.levelCount(1));
	assertEquals("LevelCount 2 is: ", 2, test.levelCount(2));
	assertEquals("LevelCount 3 is: ", 0, test.levelCount(3));
    }

    @Test
    public void testWeightBalanceFactor() {
	fail("Not yet implemented");
    }

    @Test
    public void testNodeSum() {
	BinaryTree testLeft = new BinaryTree("1", new BinaryTree("2"), new BinaryTree("3"));
	BinaryTree test = new BinaryTree("10", testLeft, new BinaryTree("16"));
	assertEquals("Node sum is: ", 32, test.nodeSum());
    }

    @Test
    public void testDoubles() {
	fail("Not yet implemented");
    }

    @Test
    public void testMaxPathSum() {
	fail("Not yet implemented");
    }

    @Test
    public void testPreOrder() {
	fail("Not yet implemented");
    }

    @Test
    public void testInOrder() {
	fail("Not yet implemented");
    }

    @Test
    public void testPostOrder() {
	fail("Not yet implemented");
    }

    @Test
    public void testLevelOrder() {
	fail("Not yet implemented");
    }

    @Test
    public void testToStringString() {
	fail("Not yet implemented");
    }

    @Test
    public void testToString() {
	fail("Not yet implemented");
    }

}
