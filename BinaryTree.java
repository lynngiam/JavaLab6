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

    public int prune() { // Lynn
	int leftRemoved = 0;
	if (isLeaf()) {
	    setData(null);
	    leftRemoved++;
	} else {
	    left.prune();
	    right.prune();
	}
	return leftRemoved;
    }

    public boolean isFull() { // Minh
	// TODO: write the ifFull method
	if (isEmpty())
	    return true;
	if (isLeaf())
	    return true;
	if ((right.isEmpty() && !left.isEmpty()) || (!right.isEmpty() && left.isEmpty())) {
	    return false;
	}
	return right.isFull() && left.isFull();
    }

    public boolean isComplete() {
    	if (isEmpty()) return true;
    	int heightDiff = right.height() - left.height();
    	if (heightDiff > 1 || heightDiff < 0) return false;
    	return left.isComplete() && right.isComplete();
    }

    public int leafCount() { // Lynn
	// TODO: write the leafCount method
	if (isLeaf()) {
	    return 1;
	} else {
	    return left.leafCount() + right.leafCount();
	}
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

    public int levelCount(int level) { // Lynn ; becareful of NullPointerException
	// TODO: write the levelCount method
	if (isEmpty()) {
	    return 0;
	} else if (level == 0) {
	    return 1;
	} else {
	    level--;
	    return left.levelCount(level) + right.levelCount(level);
	}
    }

    public int weightBalanceFactor() {
	// TODO: write the weightBalanceFactor method
	return -1;
    }

    public int nodeSum() { // Lynn
	// TODO: write the nodeSum method
	int sum = Integer.parseInt(data);
	if (isLeaf()) {
	    return Integer.parseInt(data);
	} else {
	    return sum += (left.nodeSum() + right.nodeSum());
	}
    }

    public void doubles() {

	// TODO: write the doubles method

    }

    public int maxPathSum() {
	// TODO: write the maxPathSum method
	return -1;
    }

    public String preOrder() { // Lynn
	// TODO: write the preOrder method
	if (isEmpty()) {
	    return "";
	} else {
	    return "" + data + left.preOrder() + right.preOrder();
	}
    }

    public String inOrder() { // Lynn
	// TODO: write the inOrder method
	if (isEmpty()) {
	    return "";
	} else {
	    return "" + left.inOrder() + data + right.inOrder();
	}
    }

    public String postOrder() { // Lynn
	// TODO: write the postOrder method
	if (isEmpty()) {
	    return "";
	} else {
	    return "" + left.inOrder() + right.inOrder() + data;
	}
    }

    public String levelOrder() {
    	String result = "";
		LinkedList<BinaryTree> seq = new LinkedList<BinaryTree>();
		seq.add(this);
		while (!seq.isEmpty()) {
			BinaryTree current = seq.remove();
			result += current.data + " ";
			if (!current.left.isEmpty()) seq.add(current.left);
			if (!current.right.isEmpty()) seq.add(current.right);
		}		
		return result;
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
