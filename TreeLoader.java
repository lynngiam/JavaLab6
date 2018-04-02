
/**
 * Load a tree from a text file.  Format is line based, with each line
 * representing one node in the tree.  The first line represents the root
 * of the tree and contains the root data item.  Each additional line
 * consists of a String for data, a flag (L or R) indicating whether this
 * node is the left or right child of its parent, and an int
 * representing the (0-based) index of its parent.
 *
 * Ordering of nodes is level order.
 *
 * @author John Donaldson (Spring 2018)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeLoader {

    BinaryTree loadTreeFromFile(String fname) throws IOException {
	// TODO: write the loadTreeFromFile method
	return null;
    }

    public BinaryTree loadFromFile(String filename) {
	File file = new File(filename);
	Scanner input = null;
	ArrayList<BinaryTree> treeList = new ArrayList<BinaryTree>();
	try {
	    input = new Scanner(file);
	} catch (FileNotFoundException e) { // needs to throw FileNotFoundException
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	if (!input.hasNext()) { // check if condition
	    return new BinaryTree();
	} else {
	    String rootData = input.nextLine();
	    BinaryTree root = new BinaryTree(rootData);
	    treeList.add(root);
	    while (input.hasNextLine()) {
		String[] parts = input.nextLine().split(" ");
		String data = parts[0];
		String LRFlag = parts[1];
		int parentIndex = Integer.parseInt(parts[2]);
		BinaryTree newSubTree = new BinaryTree(data);
		treeList.add(newSubTree);
		if (LRFlag.equals("L")) {
		    BinaryTree parentTree = treeList.get(parentIndex);
		    parentTree.left = newSubTree;
		} else if (LRFlag.equals("R")) {
		    BinaryTree parentTree = treeList.get(parentIndex);
		    parentTree.right = newSubTree;
		}
	    }

	}
	return treeList.get(0);
    }

    // So you can test your tree loader
    public static void main(String[] args) throws IOException {
	if (args.length != 1) {
	    System.out.println("Usage:  java TreeLoader filename");
	} else {
	    TreeLoader tl = new TreeLoader();
	    BinaryTree t = tl.loadTreeFromFile(args[0]);
	    System.out.println(t);
	}

    }

}
