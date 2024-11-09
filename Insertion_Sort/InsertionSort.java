public class InsertionSort{
  public static void main(String args[]){
    int[] list = {4,25,3,5,2,1,6};

        int currentValue;
        int n = list.length;
        int insertIndex;
        for(int i=0; i<n-1; i++){
            for(int num: list){
                System.out.print(num + " ");
            }
            System.out.println();
          currentValue = list[i+1];
          for( int j=i; j>=0; j--){
            if(list[j]>currentValue){
              list[j+1] = list[j];
              if(j==0)
                list[j] = currentValue;
            }
            else{
              list[j+1] = currentValue;
              break;
            }
          }
        }
        for(int num: list){
            System.out.print(num + " ");
        }
  }
}