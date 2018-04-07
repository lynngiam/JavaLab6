public class BinaryTree {

    protected String data;
    protected BinaryTree left, right;

    BinaryTree() {
	data = null;
	left = right = null;
    }

    BinaryTree(String item) {
	data = item;
	left = new BinaryTree();
	right = new BinaryTree();
    }

    BinaryTree(String item, BinaryTree left, BinaryTree right) {
	data = item;
	this.left = left;
	this.right = right;
    }

    public String getData() {
	return data;
    }

    public BinaryTree getLeft() {
	return left;
    }

    public BinaryTree getRight() {
	return right;
    }

    public void setData(String obj) {
	data = obj;
    }

    public void setLeft(BinaryTree tree) {
	left = tree;
    }

    public void setRight(BinaryTree tree) {
	right = tree;
    }

    public boolean isEmpty() {
	return left == null;
    }

    public boolean isLeaf() {
	return !isEmpty() && left.isEmpty() && right.isEmpty();
    }

    public int nodeCount() {
	if (isEmpty())
	    return 0;
	else
	    return 1 + left.nodeCount() + right.nodeCount();
    }

    public int prune() {
	// TODO: write the prune method
	return -1;
    }

    public boolean isFull() {
    	if (isEmpty()) return true;
    	if (isLeaf()) return true;
    	if ((right.isEmpty() && !left.isEmpty()) || 
				(!right.isEmpty() && left.isEmpty())) {
			return false;
		}
	return right.isFull() && left.isFull();
    }

    public boolean isComplete() {
	// TODO: write the isComplete method
	return false;
    }

    public int leafCount() {
	// TODO: write the leafCount method
	return -1;
    }

    public BinaryTree mirrorImage() {
	// TODO: write the mirrorImage method
	if (isEmpty()) {
	    return new BinaryTree();
	} else {
	    return new BinaryTree(data, right.mirrorImage(), left.mirrorImage());
	}
    }

    public int height() {
	// TODO: write the height method
	if (isEmpty()) {
	    return -1;
	} else {
	    return 1 + Math.max(left.height(), right.height());
	}
    }

    public int levelCount(int level) {
	// TODO: write the levelCount method
	return -1;
    }

    public int weightBalanceFactor() {
	// TODO: write the weightBalanceFactor method
	return -1;
    }

    public int nodeSum() {
	// TODO: write the nodeSum method
	return -1;
    }

    public void doubles() {
	// TODO: write the doubles method
    }

    public int maxPathSum() {
	// TODO: write the maxPathSum method
	return -1;
    }

    public String preOrder() {
	// TODO: write the preOrder method
	return "";
    }

    public String inOrder() {
	// TODO: write the inOrder method
	return "";
    }

    public String postOrder() {
	// TODO: write the postOrder method
	return "";
    }

    public String levelOrder() {
	// TODO: write the levelOrder method
	return "";
    }

    public String toString(String indent) {
	if (isEmpty())
	    return "";
	else
	    return right.toString(indent + "   ") + "\n" + indent + "/\n" + indent + data + "\n" + indent + "\\"
		    + left.toString(indent + "   ");
    }

    public String toString() {
	return toString("");
    }
}
