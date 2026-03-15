public class EvenOdd {
    public static void main (String[] args){
        int []a = {1,2,3,4,5,6,7,8} ;
        int n = a.length;
        for (int i = 0 ; i < n ; i++){
            if(a[i] % 2== 0){
                int even = a[i];
                System.out.println("The Even number is :" + even);
            }
            else{
                int odd = a[i];
                System.out.println("The odd number is:" + odd);
            }

        }

    }
}
