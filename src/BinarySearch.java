import static com.sun.jndi.toolkit.dir.DirSearch.search;

public class BinarySearch {
    public static void main (String [] args){
        int []a = {1,2,3,4,5,6,7};
       int target = 6;
       int n = a.length;
       int result = search(a , target);
       if(result == -1) {
           System.out.print("Number not found");
       }
           else {
               System.out.print("Number found at index" +" "+ result);
           }
       }
       static int search(int[] a,int target){
        int left = 0;
        int right = a.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;

            if(a[mid]==target){
                return mid ;
            }
            else if(a[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
       }
}

