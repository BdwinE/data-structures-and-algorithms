public class InsertionSort{
  public static void main(String args[]){
    int[] list = {4,25,3,5,2,1,6};
        
    int currSortedIndex;
    int currentValue;
    for(int sortedEnd=0; sortedEnd<list.length-1; sortedEnd++){
        currentValue = list[sortedEnd+1];
        currSortedIndex = sortedEnd;
        while(currSortedIndex>=0 && list[currSortedIndex]>currentValue){
            list[currSortedIndex+1] = list[currSortedIndex];
            currSortedIndex--;
        }
        list[currSortedIndex+1] = currentValue;
    }
    for(int num: list){
        System.out.print(num+" ");
    }
  }
}