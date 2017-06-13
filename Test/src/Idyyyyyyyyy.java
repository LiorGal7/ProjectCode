import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;

import javax.swing.tree.TreeNode;

import org.omg.CORBA.Current;

//import BinaryTree1.TreeNode;
public class Idyyyyyyyyy {
	public static void main(String[] args) throws IOException {
		File outfile = new File("outputT.txt");
		PrintWriter output = new PrintWriter(outfile);
		// Circle1T[] list1 = {new Circle1T(2, "BLUE", true),
		// new Circle1T(3, "red", false), new Circle1T(2, "yellow", false),
		// new Circle1T(5, "GREEN", false), new Circle1T(6, "white", false),
		// new Circle1T(1, "pink", true), new Circle1T(2, "brown", true),
		// new Circle1T(1, "black", true), new Circle1T(2, "indigo", true),
		// new Circle1T(3, "purple", true), new Circle1T(3, "orange", true),
		// new Circle1T(14, "WHITE", false), new Circle1T(12)};

		// השלם /השלימי קריאה למיון על ידי מיזוג- call mergesort for list1

		// output.println("list1 after sort");
		// for (int i = 0; i < list1.length; i++) {
		// output.println(list1[i]); }
		// GeometricObject1T[] list2 = {new Circle1T(3, "YELLOE", true),
		// new Circle1T(5, "BLUE", true), new Circle1T(1, "RED", false),
		// new Rectangle1T(3, 3, "pink", true),
		// new Rectangle1T(5, 4, "PURPLE", true),
		// new Circle1T(1, "WHITE", true), new Circle1T(2),
		// new Circle1T(3, "black", false),
		// new Rectangle1T(1,12, "white", true)};
		//
		// השלם/השלימי קריאה למיון על ידי מיזוג - call mergesort for list2
		//
		// System.out.println("list2 after sort");
		// for (int i = 0; i < list2.length; i++) {
		// output.println(list2[i]); }
		//
		// השלם/השלימי הגדרת ויצירת 2 האוביקטים מסוג עץ בינארי כמו שהתבקש בשאלה
		// generate tree1 and tree2
		//
		//
		//
		//
		//
		//
		// tree1.insert(new Circle1T(3,"Orange", false));
		// tree1.insert(new Circle1T(5,"Yellow", true));
		// tree1.insert(new Circle1T(1, "ROSE", true));
		// tree1.insert(new Circle1T(3,"OrangE", true));
		// tree1.insert(new Rectangle1T(3, 3, "rose", true));
		// tree1.insert(new Rectangle1T(5, 4, "black", true));
		// tree1.insert(new Rectangle1T(1,12));
		// tree2.insert(new Circle1T(3,"Orange", false));
		// tree2.insert(new Circle1T(5,"Yellow", true));
		// tree2.insert(new Circle1T(1, "ROSE", true));
		// tree2.insert(new Circle1T(3,"OrangE", true));
		// tree2.insert(new Rectangle1T(3, 3, "rose", true));
		// tree2.insert(new Rectangle1T(5, 4, "black", true));
		// tree2.insert(new Rectangle1T(1,12));
		// System.out.println("Inorder (sorted) tree1: ");
		// tree1.inorder();
		// output.println("Inorder (sorted) tree2: ");
		// tree2.inorder();
	}

	// השלם / השלימי הגדרת המתודה
	// mergeSort
	//
	//
	{
		// if (list.length > 1)
		// { // Merge sort the first half
		// @SuppressWarnings("unchecked")
		// E[] firstHalf = (E[])new Object[list.length / 2];
		// System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
		// השלם/השלימי את החסר
		//
		// Merge sort the second half
		// int secondHalfLength = list.length - list.length / 2;
		// @SuppressWarnings("unchecked")
		// E[] secondHalf = (E[])new Object[secondHalfLength];
		// System.arraycopy(list, list.length/2, secondHalf, 0,
		// secondHalfLength);
		// השלם/השלימי את החסר
		//
		// Merge firstHalf with secondHalf
		// E[] temp = merge(firstHalf, secondHalf, comparator);
		// System.arraycopy(temp, 0, list, 0, temp.length);
		// }
		// }
		// השלם / השלימי הגדרת המתודה
		// merge
		//
		//
		{ // @SuppressWarnings("unchecked")
			// E[] temp = (E[])new Object[list1.length + list2.length];
			// int current1 = 0; // Index in list1
			// int current2 = 0; // Index in list2
			// int current3 = 0; // Index in temp
			// while (current1 < list1.length && current2 < list2.length) {

			// השלם / השלימי את החסר {

			// temp[current3++] = list1[current1++]; }
			// else { temp[current3++] = list2[current2++]; }
			// }
			// while (current1 < list1.length) {
			// temp[current3++] = list1[current1++]; }
			// while (current2 < list2.length) {
			// temp[current3++] = list2[current2++]; }
			// return temp;
		}
	}

	class Rectangle1T extends GeometricObject1T {
		private double width;
		private double height;

		public Rectangle1T() {
		}

		public Rectangle1T(double width, double height) {
			setHeight(height);
			setWidth(width);
		}

		public Rectangle1T(double width, double height, String color, boolean filled) {
			super(color, filled);
			setHeight(height);
			setWidth(width);
		}

		/** Return width */
		public double getWidth() {
			return width;
		}

		/** Set a new width */
		public void setWidth(double width) {
			this.width = width;
		}

		/** Return height */
		public double getHeight() {
			return height;
		}

		/** Set a new height */
		public void setHeight(double height) {
			this.height = height;
		}

		/** Return area */
		public double getArea() {
			return width * height;
		}

		/** Return perimeter */
		public double getPerimeter() {
			return 2 * (width + height);
		}

		/** Override the toString() method defined in the Object class */
		public String toString() {
			return "[Rectangle] width = " + width + "[Rectangle] height = " + height + " area = " + this.getArea()
			+ " perimeter = " + this.getPerimeter() + " color = " + this.getColor() + " isFilled = "
			+ this.isFilled();
		}
	}

	abstract class GeometricObject1T {
		private String color = "white";
		private boolean filled;

		/** Default construct */
		protected GeometricObject1T() {
		}

		/** Construct a geometric object */
		public GeometricObject1T(String color, boolean filled) {
			setColor(color);
			setFilled(filled);
		}

		/** Getter method for color */
		public String getColor() {
			return color;
		}

		/** Setter method for color */
		public void setColor(String color) {
			this.color = color;
		}

		/**
		 * Getter method for filled. Since filled is boolean, so, the get method
		 * name is isFilled
		 */
		public boolean isFilled() {
			return filled;
		}

		/** Setter method for filled */
		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		/** Abstract method findArea */
		public abstract double getArea();

		/** Abstract method getPerimeter */
		public abstract double getPerimeter();
	}

	class Circle1T extends GeometricObject1T {
		private double radius;

		public Circle1T() {
			setRadius(1);
		}

		public Circle1T(double radius) {
			setRadius(radius);
		}

		public Circle1T(String color, boolean filled, double radius) {
			super(color, filled);
			setRadius(radius);
		}

		/** Return radius */
		public double getRadius() {
			return radius;
		}

		/** Set a new radius */
		public void setRadius(double radius) {
			this.radius = radius;
		}

		/** Implement the getArea method defined in GeometricObject */
		public double getArea() {
			return radius * radius * Math.PI;
		}

		/** Implement the getPerimeter method defined in GeometricObject */
		public double getPerimeter() {
			return 2 * radius * Math.PI;
		}

		/** Override the equals() method defined in the Object class */
		public boolean equals(Circle1T circle) {
			return this.radius == circle.getRadius();
		}

		/** Override the toString() method defined in the Object class */
		public String toString() {
			return "[Circle] radius = " + radius + " area = " + this.getArea() + " perimeter = " + this.getPerimeter()
			+ " color = " + this.getColor() + " isFilled = " + this.isFilled();
		}
	}

	public class GeometricObjectCompratorA1T implements Comparator<GeometricObject2> {

		@Override
		public int compare(GeometricObject2 o1, GeometricObject2 o2) {
			double res = o1.getArea() - o2.getArea();
			if (res > 0)
				return 1;
			if (res < 0)
				return -1;
			return 0;
		}

	}

	public class GeometricObjectCompratorD1T implements Comparator<GeometricObject2> {

		@Override
		public int compare(GeometricObject2 o1, GeometricObject2 o2) {
			double res = o1.getArea() - o2.getArea();
			if (res > 0)
				return -1;
			if (res < 0)
				return 1;
			return 0;
		}

	}

	public class GeometricObjectComparatorColorA1T implements Comparator<GeometricObject2> {

		@Override
		public int compare(GeometricObject2 o1, GeometricObject2 o2) {
			String o1Color = o1.getColor().toLowerCase();
			String o2Color = o2.getColor().toLowerCase();
			if (o1Color != o2Color) {
				return o1Color.compareTo(o2Color);
			}
			if (o1.isFilled() == o2.isFilled())
				return 0;
			if (o1.isFilled() == true)
				return 1;
			return -1;
		}

	}

	public class GeometricObjectComparatorColorD1T implements Comparator<GeometricObject2> {

		@Override
		public int compare(GeometricObject2 o1, GeometricObject2 o2) {
			String o1Color = o1.getColor().toLowerCase();
			String o2Color = o2.getColor().toLowerCase();
			if (o1Color != o2Color) {
				return -1 * o1Color.compareTo(o2Color);
			}
			if (o1.isFilled() == o2.isFilled())
				return 0;
			if (o1.isFilled() == true)
				return 1;
			return -1;
		}

	}

	interface Tree1<E> {
		/** Return true if the element is in the tree */
		public boolean search(E e);

		/**
		 * Insert element o into the binary tree Return true if the element is
		 * inserted successfully
		 */
		public boolean insert(E e);

		/**
		 * Delete the specified element from the tree Return true if the element
		 * is deleted successfully
		 */
		public boolean delete(E e);

		/** Inorder traversal from the root */
		public void inorder();

		/** Postorder traversal from the root */
		public void postorder();

		/** Preorder traversal from the root */
		public void preorder();

		/** Get the number of nodes in the tree */
		public int getSize();

		/** Return true if the tree is empty */
		public boolean isEmpty();

		/** Return an iterator to traverse elements in the tree */
		@SuppressWarnings("rawtypes")
		public java.util.Iterator iterator();
	}

	abstract class AbstractTree1<E> implements Tree1<E> {
		/** Inorder traversal from the root */
		public void inorder() {
		}

		/** Postorder traversal from the root */
		public void postorder() {
		}

		/** Preorder traversal from the root */
		public void preorder() {
		}

		/** Return true if the tree is empty */
		public boolean isEmpty() {
			return getSize() == 0;
		}

		/** Return an iterator to traverse elements in the tree */
		@SuppressWarnings("rawtypes")
		public java.util.Iterator iterator() {
			return null;
		}
	}

	class BinaryTree1<E> extends AbstractTree1<E> {
		private TreeNode<E> root;
		private int size = 0;
		private PrintWriter pw;
		private Comparator<E> c;

		public BinaryTree1(PrintWriter pw, Comparator<E> c) {
			this.pw = pw;
			this.c = c;
		}

		public BinaryTree1(PrintWriter pw, E[] objects) {
			this.pw = pw;
			this.c = c;
			for (int i = 0; i < objects.length; i++)
				insert(objects[i]);
		}

		/** Returns true if the element is in the tree */
		public boolean search(E e) {
			TreeNode<E> current = root; // Start from the root
			while (current != null) {
				if (c.compare((E) current, e) > 0)
					current = current.left;
				else if (c.compare((E) current, e) < 0)
					current = current.right;
				else if(c.compare((E) current, e) == 0)
					return true;
			}
			return false;
		}

		/**
		 * Insert element o into the binary tree Return true if the element is
		 * inserted successfully
		 */
		public boolean insert(E e) {
			if (root == null)
				root = createNewNode(e); // Create a new root
			else {//Locate the parent node
				TreeNode<E> parent = null;
				TreeNode<E> current = root;
				while (current != null)
					if(c.compare(e, current.element) < 0){
						parent = current;
						current = current.left;
					}else if(c.compare(e, current.element) > 0){
						parent = current;
						current = current.right;
					}else 
						return false; // Duplicate
				if(c.compare(e, parent.element) < 0)
					parent.left = createNewNode(e);
				else
					parent.right = createNewNode(e);
			}
			size++;
			return true;
		}// Element inserted

		protected TreeNode<E> createNewNode(E e) {
			return new TreeNode<E>(e);
		}

		/** Inorder traversal from the root */
		public void inorder() {
			inorder(root);
		}

		/** Inorder traversal from a subtree */
		protected void inorder(TreeNode<E> root) {
			if (root == null)
				return;
			inorder(root.left);
			System.out.println(root.element + " ");
			inorder(root.right);
		}

		/** Postorder traversal from the root */
		public void postorder() {
			postorder(root);
		}

		/** Postorder traversal from a subtree */
		protected void postorder(TreeNode<E> root) {
			if (root == null)
				return;
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.element + " ");
		}

		/** Preorder traversal from the root */
		public void preorder() {
			preorder(root);
		}

		/** Preorder traversal from a subtree */
		protected void preorder(TreeNode<E> root) {
			if (root == null)
				return;
			System.out.print(root.element + " ");
			preorder(root.left);
			preorder(root.right);
		}

		/** Inner class tree node */
		public static class TreeNode<E> {
			E element;
			TreeNode<E> left;
			TreeNode<E> right;

			public TreeNode(E e) {
				element = e;
			}
		}

		/** Get the number of nodes in the tree */
		public int getSize() {
			return size;
		}

		/** Returns the root of the tree */
		@SuppressWarnings("rawtypes")
		public TreeNode getRoot() {
			return root;
		}

		/** Returns a path from the root leading to the specified element */
		public java.util.ArrayList<TreeNode<E>> path(E e) {
			java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<TreeNode<E>>();
			TreeNode<E> current = root; // Start from the root
			while (current != null) {
				list.add(current); // Add the node to the list
				// השלם / השלימי את החסר
				current = current.left;
			}
			// השלם / השלימי את החסר
			current = current.right;
		}else break;

	}return list; // Return an array of nodes
}

/**
 * Delete an element from the binary tree. Return true if the element is
 * deleted successfully Return false if the element is not in the tree
 */
public boolean delete(E e) { // Locate the node to be deleted and also
	// locate its parent node
	TreeNode<E> parent = null;
	TreeNode<E> current = root;
	while (current != null) {
		// השלם / השלימי את החסר
		parent = current;
		current = current.left;
	}
	// השלם / השלימי את החסר
	parent = current;
	current = current.right;
}else break; // Element is in the tree
// pointed by current
}if(current==null)return false; // Element is not in the tree
Case 1:

	current has
	no left children if(current.left==null){
		Connect the
		parent with
		the right
		child of
		the current node if(parent==null)
		{
			root = current.right;
		}else
		{
			// השלם / השלימי את החסר
			parent.left = current.right;
			else parent.right = current.right;
		}}else{
			// Case 2: The current node has a left child
			// Locate the rightmost node in the left subtree of
			// the current node and also its parent
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;while(rightMost.right!=null)
			{
				parentOfRightMost = rightMost;
				rightMost = rightMost.right;
			}// Keep going to the right
			//Replace the element in current by the element in rightMost current.element=rightMost.element;
			Eliminate rightmost node if(parentOfRightMost.right==rightMost)parentOfRightMost.right=rightMost.left;else Special case:parentOfRightMost==
					current
					parentOfRightMost.left=rightMost.left;
		}size--;return true; // Element inserted
	}

	/** Obtain an iterator. Use inorder. */
	@SuppressWarnings("rawtypes")
	public java.util.Iterator iterator() {
		return inorderIterator(); }

	/** Obtain an inorder iterator */
	@SuppressWarnings("rawtypes")
	public java.util.Iterator inorderIterator() {
		return new InorderIterator();
	}

	@SuppressWarnings("rawtypes")
	Inner class InorderIterator
	class InorderIterator implements java.util.Iterator
	{ // Store the elements in a list
		private java.util.ArrayList<E> list =
				new java.util.ArrayList<E>();
		private int current = 0; // Point to the current element in list
		public InorderIterator() {
			inorder(); // Traverse binary tree and store elements in list
		}
		/** Inorder traversal from the root */
		private void inorder() {
			inorder(root); }
		/** Inorder traversal from a subtree */
		private void inorder(TreeNode<E> root) {
			if (root == null)return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right); }
		/** Next element for traversing? */
		public boolean hasNext() {
			if (current < list.size()) return true;
			return false; }
		/** Get the current element and move cursor to the next */
		public Object next() {
			return list.get(current++); }
		/** Remove the current element and refresh the list */
		public void remove() {
			delete(list.get(current)); // Delete the current element
			list.clear(); // Clear the list
			inorder(); // Rebuild the list
		}
	}
	/** Remove all elements from the tree */
	public void clear() {
		root = null;
		size = 0; }
}
