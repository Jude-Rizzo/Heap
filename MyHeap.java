public class MyHeap{
  //swap method for later convinience
  private static void swap(int[] data, int a, int b) {
		int sto = data[a];
		data[a] = data[b];
		data[b] = sto;
	}
}
