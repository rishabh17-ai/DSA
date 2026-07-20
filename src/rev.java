public class rev {
    public static void main (String []args){
        int []a = {1,2,3,4,5,6};
        int n = a.length;
      int left = 0;
      int right = n - 1;
      while(left < right) {
            int temp = a[right];
            a[right] = a[left];
            a[left] = temp;

            left++;
            right--;
        }
      for(int i = 0;i < n ; i++){
          System.out.print(a[i]);
      }
    }
}
