import java.lang.Object;

public class MyHeap{
  //swap method for later convinience
  private static void swap(int[] data, int x, int y) {
		int sto = data[x];
		data[x] = data[y];
		data[y] = sto;
	}




//Doing the pushdown method

private static int checkChildren(int size, int index){
  int right = 2 * index + 2;
  if(right == size) return 1;
  if(right < size) return 2;
  return 0;
}



private static void pushDown(int[] data, int size, int index){
  //pushdown is always activated, so we keep swapping stuff
  while(1 == 1){
    int lkid = 2 * index + 1;
    int rkid = 2 * index + 2;
    int kids = checkChildren(size, index);
    if(kids == 0){
      return;
    }

    if(kids == 1){
      if(data[lkid] > data[index]){
        swap(data, lkid, index);
        index = lkid;
        return;
      } else {
        return;
      }
    }



    if (kids == 2){
      int chosen = Math.max(data[lkid], data[rkid]);
      int chosen1;
      //you have to get the index now
      if(chosen == data[lkid]){
        chosen1 = lkid;
      } else {
        chosen1 = rkid;
      }

      if(chosen > data[index]){
        swap(data, chosen1, index);
        index = chosen1;
        return;
      } else {
        return;
      }
    }
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




//starts at the size - 1, then, in the heap it just keep pushing down into the data structure
public static void heapify(int[] data) {
  int size = data.length - 1;
  for (int i = size; i > -1; i--) {
    pushDown(data, size, i);
  }
}


}
