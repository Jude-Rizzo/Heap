import java.lang.Object;

public class MyHeap{
  //swap method for later convinience
  private static void swap(int[] data, int x, int y) {
		int sto = data[x];
		data[x] = data[y];
		data[y] = sto;
	}

  }


//Doing the pushdown method

private static int checkChildren(int size, int index){
  right = 2 * index + 2
  if(right == size) return 1;
  if(right < size) return 2;
  if(right > size) return 0;
}



private static void pushDown(int[] data, int size, int, index){
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
      int chosen = Math.max(data[lchild], data[rchild]);
      int chosen1;
      //you have to get the index now
      if(chosen == data[lchild]){
        chosen1 = lchild;
      } else {
        chosen1 = rchild;
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
