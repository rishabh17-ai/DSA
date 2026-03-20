public class Sorted {
    public static void main(String []args){
        int []a = {1,2,6,4,5};
        int n = a.length;

        boolean isSorted = true;
        for(int i = 0 ; i < n - 1 ; i++){
          if(a[i] > a[i+1]){
              isSorted = false;
              break;
          }
                }

        if(isSorted)
        {
        System.out.print("Array is Sorted");
        }
        else{
            System.out.print("Array is not Sorted");
        }
    }
        }

