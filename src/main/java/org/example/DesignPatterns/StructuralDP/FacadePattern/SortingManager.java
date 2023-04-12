package org.example.DesignPatterns.StructuralDP.FacadePattern;

public class SortingManager {

	private final Algorithm bubbleSort;
	private final Algorithm mergeSort;
	private final Algorithm heapSort;
	
	public SortingManager(){
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.heapSort = new HeapSort();
	}
	
	public void mergeSort(){
		this.mergeSort.sort();
	}
	
	public void bubbleSort(){
		this.bubbleSort.sort();
	}
	
	public void heapSort(){
		this.heapSort.sort();
	}
}
