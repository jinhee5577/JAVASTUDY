package selection정렬;

public class Selection_Sort {
	// 선택정렬 구현.	

	public static void main(String[] args) {
		int[] arr = {3,6,1,8,2,4};
		printArray(arr);
		selectionSort(arr);
		System.out.println();
		System.out.println("정렬된 배열");
		printArray(arr);
	}
	
	// selectionSort 펑션
	public static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
		
	}
	
	// selectionSort 펑션
	public static void selectionSort(int[] arr, int start) {
		if(start < arr.length -1) {
		   int min_index = start;
		   for(int i = start; i< arr.length; i++) { // 가장 작은 원소의 ind를 찾는다.
			 if(arr[i] < arr[min_index]) {min_index = i;}
		   }
		   swap(arr, start, min_index);
		   selectionSort(arr, start + 1);
		}
	}
	
	// swap 펑션
	public static void swap(int[] arr, int index1, int index2) {
//		[arr[index1],arr[index2]] = [arr[index2],arr[index1]]; // 이게안되나?
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	 
	// printArray펑션
	public static void printArray(int[] arr) {
		for(int data: arr){
			System.out.print(data+ ",");
		}
		System.out.println();
		
	}
	

}
