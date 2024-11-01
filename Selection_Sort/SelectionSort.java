
public class SelectionSort{

  public static void main(String[] args){
    int[] list = {1,4,5,6,3,7,8,9};
    int smallestValIndex;
    int temp;
    for(int pointer=0; pointer<list.length-1; pointer++){   
      smallestValIndex = pointer;   
      for(int i=pointer; i<list.length; i++){
        if(list[i]<list[smallestValIndex]){
          smallestValIndex = i;
        }
      }
      //swap
      temp = list[smallestValIndex];
      list[smallestValIndex] = list[pointer];
      list[pointer] = temp;
    }
    for(int i=0; i<list.length; i++){
      System.out.print(list[i] + " ");
    }
  }  
}