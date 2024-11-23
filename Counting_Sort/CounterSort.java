import java.util.Arrays;
class CounterSort {
    public static void main(String[] args) {
        int[] list = {4, 1, 3, 5, 1, 4, 4};
        
        int k = findHighest(list);
        
        int[] array = new int[k+1];
        
        int[] occurList = makeOccurrenceList(list, array);
        
        rebuildList(list, occurList);       
        
        for(int num:list){
            System.out.print(num + " ");
        }
    }
    
    public static int findHighest(int[] list){
        int max = list[0];
        for(int i=1; i<list.length; i++){
            max = list[i]>max ? list[i] : max;
        }
        return max;
    }
    
    public static int[] makeOccurrenceList(int[] list, int[] array){
        int[] copyArray = Arrays.copyOf(array, array.length);
        for(int i=0; i<list.length; i++){
            copyArray[list[i]] += 1;
        }
        return copyArray;
    }
    
    public static void rebuildList(int[] list, int[] occurList){
        int currIndex = 0;
        for(int i=0; i<occurList.length; i++){
            for(int j=0; j<occurList[i]; j++){
                list[currIndex++] = i;
            }
        }
    }
}