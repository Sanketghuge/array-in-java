package Arrays;

public class Selection_sort {

	public static void main(String[] args) {

		// SELECTION SORTING

		// index -- 0 1 2 3
		int arr[] = { 3, 4, 2, 1 };
		for (int i = 0; i < arr.length; i++) { // i loop for sorted array
			int min = i; // min = i
			for (int j = i + 1; j < arr.length; j++) { // j loop for unsorted array

				// if j loop / unsorted array has smaller element than assumed min then update
				// min index

				if (arr[min] > arr[j]) { // min>element from j / unsorted array
					min = j; // Update assume min with actual min from j loop
				}
				// once the min value is final
			}

			int temp = arr[i]; // then swap element at i
			arr[i] = arr[min]; // with actual element at min
			arr[min] = temp;
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
