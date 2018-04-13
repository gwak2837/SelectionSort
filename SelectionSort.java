public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {2, 9, 5, 4, 8, 1, 6};
		
		for(int i = 0; i < a.length; i++) {
			swapList(a, i, minIndex(a, i));
		}
		
		showList(a);
	}
	
	public static void swapList(int[] a, int i1, int i2) {
		int temp = a[i2];
		a[i2] = a[i1];
		a[i1] = temp;
	}
	
	public static int minIndex(int[] a, int startIndex) {
		int min = a[startIndex];
		int minIndex = startIndex;
		for(int i = startIndex + 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void showList(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

