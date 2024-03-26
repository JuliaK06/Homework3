/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg;

import java.util.ArrayList;

/**
 *
 * @author A
 */
public class Heap {
    private ArrayList<GraphicElement> list;
	
	/** Create a default heap */
	 public Heap() {
		  list = new ArrayList<>();
	 }
	 
	 /** Create a heap from an array of objects */
	 public Heap(GraphicElement[] objects) {
		 this();
		 for (int i = 0; i < objects.length; i++)
			 add(objects[i]);
	 }
	 
	 /** Add a new object into the heap */
	 public void add(GraphicElement newObject) {
		 list.add(newObject); // Append to the heap
		 int currentIndex = list.size() - 1; // The index of the last node
	 
		 while (currentIndex > 0) {
			 int parentIndex = (currentIndex - 1) / 2;
			 // Swap if the current object is greater than its parent
			 if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
				 GraphicElement temp = list.get(currentIndex);
				 list.set(currentIndex, list.get(parentIndex));
				 list.set(parentIndex, temp);
			 }
			 else
				 break; // The tree is a heap now
	 
			 currentIndex = parentIndex;
		 }
	 }
         
         public GraphicElement remove() { 
		 if (list.size() == 0) return null;
		 
		 GraphicElement removedObject = list.get(0);
		 list.set(0, list.get(list.size() - 1));
		 list.remove(list.size() - 1);
		 
		 int currentIndex = 0;
		 	while (currentIndex < list.size()) {
		 		int leftChildIndex = 2 * currentIndex + 1;
		 		int rightChildIndex = 2 * currentIndex + 2;
		 
		 		// Find the maximum between two children
		 		if (leftChildIndex >= list.size()) break; // The tree is a heap
		 		int maxIndex = leftChildIndex;
				 //left is the maximum unless there is a right child and it is >=left in which case the right becomes the max
		 		if (rightChildIndex < list.size()) {
		 			if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                                            maxIndex = rightChildIndex;
		 			}
		 		} 
		 
		 		// Swap if the current node is less than the maximum
		 		if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
		 			GraphicElement temp = list.get(maxIndex);
		 			list.set(maxIndex, list.get(currentIndex)); 
		 			list.set(currentIndex, temp); 
		 			currentIndex = maxIndex; 
		 		} 
		 		else
		 			break; // The tree is a heap
		 	}
		 
		 	return removedObject;
	 }
         
          public int getSize() {
		 return list.size();
	 }
}
                                        

