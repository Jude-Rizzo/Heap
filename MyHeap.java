import java.lang.Object;

public class MyHeap{






  //starts at the size - 1, then, in the heap it just keep pushing down into the data structure
  public static void heapify(int[] data) {
    int size = data.length - 1;
    for (int i = size; i > -1; i--) {
      pushDown(data, size, i);
    }
  }


//look at how small and fresh this is
  public static void heapsort(int[] data) {
    heapify(data);
    int size = data.length;
    for (int i = size-1; i > -1; i--) {
      swap(data, 0, i);
      size--;
      pushDown(data, size, 0);
    }
  }





  //swap method for later convinience
  private static void swap(int[] data, int x, int y) {
		int sto = data[x];
		data[x] = data[y];
		data[y] = sto;
	}




//Doing the pushdown method

private static int checkChildren(int size, int index){
  int lkid = 2 * index + 1;
  if(lkid == size - 1) return 1;
  if(lkid > size - 1) return 0;
  return 2;
}



private static void pushDown(int[] data, int size, int index) {
		while (0 < 1) {
			int lkid = 2 * index + 1;
			int rkid = 2 * index + 2;
      int kids = checkChildren(size, index);

			if (kids == 1) {
				if (data[lkid] > data[index]) {
					swap(data, lkid, index);
					index = lkid;
				}
				return;

			} else if (kids == 2) {
        if (data[lkid] > data[rkid]) {
          if (data[lkid] > data[index]) {
            swap(data, lkid, index);
            index = lkid;
          } else return;
        } else {
          if (data[rkid] > data[index]) {
            swap(data, rkid, index);
            index = rkid;
          } else return;
        }

			} else return;
		}
	}










private static void pushUp(int[] data, int index) {
  while (index > 0) {
    //keep going until we are the top or we can't swap with the paretn
    int parent = (index-1)/2;
    if (data[index] > data[parent]) {
      swap(data, parent, index);
      index = parent;
    } else return;
  }
}











}
