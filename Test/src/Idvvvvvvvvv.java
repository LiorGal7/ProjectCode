import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Idvvvvvvvvv {
	public static void main(String[] args) throws IOException {
		File outfile = new File("output.txt");
		PrintWriter output = new PrintWriter(outfile);
		Circle2[] list1 = {new Circle2(2, "red", true),
				new Circle2(3, "Orange", false), new Circle2(2, "yellow", true),
				new Circle2(5, "green", true), new Circle2(6, "Blue", false),
				new Circle2(1, "Indigo", true), new Circle2(2, "purple", false),
				new Circle2(1, "INDIGO", true), new Circle2(2, "PURPLE", false),
				new Circle2(3, "Red", true), new Circle2(14), new Circle2(1)};
		quickSort(list1,0, list1.length-1,new GeometricObjectCompratorA2());
		output.println("list1 after sort");
		for (int i = 0; i < list1.length; i++) {
			output.println(list1[i]); }
		GeometricObject2[] list2 = {new Circle2(3, "red", false),
				new Circle2(5, "Green", true), new Circle2(1, "black", true),
				new Rectangle2(3, 3, "Purple", true), new Circle2(1, "INDIGO", true),
				new Circle2(2, "PUrPlE", false), new Rectangle2(5, 4, "White",
						false),
				new Rectangle2(1,12, "oRangE", true)};
		quickSort(list2,0,list2.length-1,new GeometricObjectCompratorCA2());
		output.println("list2 after sort");
		for (int i = 0; i < list2.length; i++) {
			output.println(list2[i]); 
		}
		MyPriorityQueue2<GeometricObject2> queue1 =new  MyPriorityQueue2<>(new GeometricObjectCompratorCD2());
		MyPriorityQueue2<GeometricObject2> queue2 = new MyPriorityQueue2<>(new MGeometricObjectCompratorD2());
		for(int i = 0 ; i < list2.length ; i++)
			queue1.enqueue(list2[i]);
	
		 queue1.enqueue(new Circle2(3,"red",false));
		 queue1.enqueue(new Circle2(5, "RED", false));
		 queue1.enqueue(new Circle2(1, "Red", true));
		 queue1.enqueue(new Rectangle2(3, 3, "yellow", true ));
		 queue1.enqueue(new Rectangle2(5, 4, "YELLOW", false));
		 queue1.enqueue(new Rectangle2(1,12));
		 output.println("weighted queue1");
		while(queue1.getSize() > 0){
			GeometricObject2 temp = (GeometricObject2) queue1.dequeue();
			output.print(temp);
			queue2.enqueue(temp);
		}
		 output.println("weighted queue2");
		while(queue2.getSize() > 0)
			output.print(queue2.dequeue());
		output.close();
		 // השלם/השלימי הוצאת האברים מהתור השני והדפסתם לקובץ
		//
		//
		//
	}
	public static<E>void quickSort(E[] list,int first,int last,Comparator<E> c){
		if (last > first) {
			int pivotIndex = partition(list, first, last,c);
			quickSort(list, first, pivotIndex - 1,c);
			quickSort(list, pivotIndex + 1, last,c);
		}
	}
	/** Partition the array list[first..last] 
	 * @param <E>*/
	// השלם/השלימי את הגדרת מתודת
	private static <E> int partition(E [] list, int first, int last ,Comparator<E> c) {

		E pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search
		while (high > low) {
			// Search forward from left
			while (low <= high && c.compare(pivot,list[low]) >= 0){
				low++; 
			}
			// Search backward from right
			while (low <= high && c.compare(pivot,list[high]) < 0) {
				high--; 
			}
			// Swap two elements in the list
			if (high > low) {
				E temp = list[high];
				list[high] = list[low];
				list[low] = temp; 
			}
		}
		while (high > first && c.compare(pivot, list[high]) <= 0){
			high--; 
		}
		//Swap pivot with list[high]
		if (c.compare(pivot, list[high]) > 0){
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else { return first; }
	}

}

class Rectangle2 extends GeometricObject2 {
	private double width;
	private double height;

	public Rectangle2() {
	}

	public Rectangle2(double width, double height) {
		super();
		setHeight(height);
		setWidth(width);
	}

	public Rectangle2(double width, double height, String color, boolean filled) {
		setColor(color);
		setFilled(filled);
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
		return height;}

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
		return "[Rectangle] width = " + width + " [Rectangle] height = " + height + " area = " + this.getArea()
		+ " perimeter = " + this.getPerimeter() + " color = " + this.getColor() + " isFilled = "
		+ this.isFilled();
	}
}

abstract class GeometricObject2 {
	private String color = "white";
	private boolean filled;

	/** Default construct */
	protected GeometricObject2() {
	}

	/** Construct a geometric object */
	public GeometricObject2(String color, boolean filled) {
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

class Circle2 extends GeometricObject2 {
	private double radius;

	public Circle2() {
		super();
		setRadius(1);
	}

	public Circle2(double radius) {
		super();
		setRadius(radius);
	}

	public Circle2(double radius, String color, boolean filled) {
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
	public boolean equals(Circle2 circle) {
		return this.radius == circle.getRadius();
	}

	/** Override the toString() method defined in the Object class */
	public String toString() {
		return "[Circle] radius = " + radius + " area = " + this.getArea() + " perimeter = " + this.getPerimeter()
		+ " color = " + this.getColor() + " isFilled = " + this.isFilled();
	}
}

class MyPriorityQueue2<E> {
	private HeapWithComparator2 heap;

	// השלם/השלימי את החסר
	//
	// @SuppressWarnings("unused")
	// השלם/השלימי את החסר
	//
	/** Create a default heap */
	public MyPriorityQueue2(Comparator<? super E> c) {
		heap = new HeapWithComparator2(c);
	}
	
	public void enqueue(E newObject) {
		heap.add(newObject);
	}

	public Object dequeue() {
		return heap.remove();
	}

	public int getSize() {
		return heap.getSize();
	}
}

class GeometricObjectCompratorA2 implements Comparator<GeometricObject2> {

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

class MGeometricObjectCompratorD2 implements Comparator<GeometricObject2> {

	@Override
	public int compare(GeometricObject2 o1, GeometricObject2 o2) {
		double res = o2.getArea() - o1.getArea();
		if (res > 0)
			return 1;
		if (res < 0)
			return -1;
		return 0;
	}

}

class GeometricObjectCompratorCA2 implements Comparator<GeometricObject2> {

	@Override
	public int compare(GeometricObject2 o1, GeometricObject2 o2) {
		RainbowColors2 r = new RainbowColors2();
		String o1Color = o1.getColor().toLowerCase();
		String o2Color = o2.getColor().toLowerCase();
		if (o1Color.compareTo(o2.getColor()) != 0) {
			int index1 = r.contains(o1Color);
			int index2 = r.contains(o2Color);
			if (index2 != index1) {
				if (index1 > index2)
					return 1;
				else
					return -1;
			}
		}
		return 0;
	}
}

class GeometricObjectCompratorCD2 implements Comparator<GeometricObject2> {

	@Override
	public int compare(GeometricObject2 o1, GeometricObject2 o2) {
		RainbowColors2 r = new RainbowColors2();
		String o1Color = o1.getColor().toLowerCase();
		String o2Color = o2.getColor().toLowerCase();
		if (o1Color.compareTo(o2.getColor()) != 0) {
			int index1 = r.contains(o1Color);
			int index2 = r.contains(o2Color);
			if (index2 != index1) {
				if (index1 < index2)
					return 1;
				else
					return -1;
			}
		}
		return 0;
	}
}

class RainbowColors2 {
	final static String[] array = { "red", "orange", "yellow", "green", "blue", "indigo", "purple" };

	public int contains(String color) {
		for (int i = 0; i < array.length; i++)
			if (array[i].compareTo(color) == 0)
				return i + 1;
		return array.length;
	}

}

class HeapWithComparator2<E> {
	private ArrayList<E> list = new ArrayList<>();
	private Comparator<E> c;

	public HeapWithComparator2(Comparator<E> c) {
		this.c = c;
	}

	/** Add a new object into the heap */
	public void add(E newObject) {
		list.add(newObject); // Append to the heap
		int currentIndex = list.size() - 1;
		// The index of the last node
		while (currentIndex > 0) {
			int parentIndex = (currentIndex - 1) / 2;
			// Swap if the current object is greater than its parent
			// השלם / השלימי את החסר
			if (c.compare(list.get(currentIndex), list.get(parentIndex)) > 0) {
				E temp = list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);
			} else
				break; // the tree is a heap now
			currentIndex = parentIndex;
		}
	}

	/** Remove the root from the heap */
	public E remove() {
		if (list.size() == 0) 
			return null;
		E removedObject = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		int currentIndex = 0;
		while (currentIndex < list.size())	{
			int leftChildIndex = 2 * currentIndex + 1;
			int rightChildIndex = 2 * currentIndex + 2;
			// Find the maximum between two children
			if (leftChildIndex >= list.size()) 
				break;
			// The tree is a heap
			int maxIndex = leftChildIndex;
			if (rightChildIndex < list.size()) { 
				if(c.compare(list.get(maxIndex),list.get(rightChildIndex)) < 0)
				{
					maxIndex = rightChildIndex; 
				}
			}
			// Swap if the current node is less than the maximum
			if(c.compare(list.get(currentIndex),list.get(maxIndex)) < 0)
			{
				E temp = list.get(maxIndex);
				list.set(maxIndex, list.get(currentIndex));
				list.set(currentIndex, temp);
				currentIndex = maxIndex; }
			else break;
		} //The tree is a heap
		return removedObject;
	}

	/** Get the number of nodes in the tree */
	public int getSize() {
		return list.size();
	}
}
