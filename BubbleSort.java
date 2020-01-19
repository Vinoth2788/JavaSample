//////////////////////Bubble Sort/////////////////////

//Bubble sort is a technique of sorting array by comparing with the adjacent elements
//It requires 2 for loops so the time complexity is huge
//but this is the easiet method of sorting array
//first loop represents iterations, i.e iteration == number of elements
//second loop is for comparing with adjacent elements in each iteration
public class BubbleSort {

	public static void sort(int sort[]) {
		for(int i=0; i<sort.length-1; i++) {
			for(int j=0; j<sort.length-i-1;j++) {
				if(sort[j]>sort[j+1]) {
					int temp = sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=temp;

				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortArray = new int[] {1,-5,10,2,8};
		BubbleSort.sort(sortArray);
		for(int elm:sortArray){
			System.out.println("Sorted Array   "+elm);
		}


	}

}
