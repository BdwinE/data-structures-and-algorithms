public class QuickSort {
    public static int[] list = {4,25,3,5,2,1,6};
    public static void main(String[] args) {
        
        quickSort(0, list.length-1);
        
        for(int num:list){
            System.out.print(num + " "); 
        }
        System.out.println();
    }
    
    public static void quickSort(int start, int end){
        if(end-start<=0)
            return;
        int pivotIndex = partition(start, end);
        quickSort(start, pivotIndex-1);
        quickSort(pivotIndex+1, end);
    }
    public static int partition(int start, int end){
        
        int pivot = list[end];
        int pointer = start-1;
        int temp;
        for(int i=start; i<end; i++){
            if(list[i]<pivot){
                temp = list[i];
                list[i] = list[++pointer];
                list[pointer] = temp;
            }
        }
        
        list[end] = list[++pointer];
        list[pointer] = pivot;
        
        return pointer;
    }
}