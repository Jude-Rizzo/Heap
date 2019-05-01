public class MyHeap{
  //swap method for later convinience
  private static void swap(int[] data, int x, int y) {
		int sto = data[x];
		data[x] = data[y];
		data[y] = sto;
	}

  }


//Doing the pushdown method

private static int checkChildren(int[] data, int size, int index){
  right = 2 * index + 2
  if(right == size) return 1;
  if(right < size) return 2;
  if(right > size) return 0;
}
